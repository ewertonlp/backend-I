package Dao.impl;

import Dao.ConfiguracaoJDBC;
import Dao.IDao;
import model.Filme;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.apache.logging.log4j.LogManager.getLogger;

@Configuration
public class FilmeDaoH2 implements IDao<Filme> {

    private ConfiguracaoJDBC configuracaoJDBC;

    // logger
    final static Logger log = getLogger(FilmeDaoH2.class);

    @Override
    public Filme salvar(Filme filme) throws SQLException {
        log.info("Abrindo a conexão");

        String SQLInsert = String.format("INSERT INTO filme (titulo, categoria)" +
                "VALUES ('%s', '%s')", filme.getTitulo(), filme.getCategoria());
        Connection connection = null;
        try {
            log.info("Salvando filme: "+filme.getTitulo());
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/filme;" +
                    "INIT=RUNSCRIPT FROM 'createFilme.sql'", "sa", "");
            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLInsert, Statement.RETURN_GENERATED_KEYS);

            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()) {
                filme.setId(resultSet.getInt(1));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("Erro ao inserir o produto: "+e.getMessage());
        } finally {
            log.info("Fechando a conexão");
            assert connection != null;
            connection.close();
        }
        return filme;
    }


    @Override
    public List<Filme> buscarTodos() throws SQLException {
        log.debug("Abrindo uma conexão no banco");

        Connection connection = null;
        Statement statement = null;
        String query = "SELECT * FROM produto";
        List<Filme> filmes = new ArrayList<>();

        Statement stmt = null;
        try {
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/filme;" +
                    "INIT=RUNSCRIPT FROM 'createFilme.sql'", "sa", "");
            connection = configuracaoJDBC.getConnection();
            stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            log.debug("Buscando todos os produtos do banco");

            while (resultado.next()) {
                filmes.add(criarObjetoFilme(resultado));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            log.debug("Fechando a conexão no banco");
            stmt.close();
        }
        return filmes;
    }


    @Override
    public void alterar(Filme filme) throws SQLException {

        String SQLUpdate = String.format("UPDATE produto set valor = '%s' where id = '%s';",
                filme.getValor(),produto.getId());

        Connection connection = null;

        try {
            log.info("Alterando o valor do produto: "+produto.getId());
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;" +
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLUpdate);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("Erro ao alterar o produto: "+e.getMessage());
        } finally {
            log.info("Encerrando a conexão");
            connection.close();
        }
    }


}
