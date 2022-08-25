package Avaliacao_parcial_1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class FilialDaoH2 implements IDao<Filial> {

    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = Logger.getLogger(String.valueOf(FilialDaoH2.class));

    public FilialDaoH2(ConfiguracaoJDBC connectionJDBC) {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
    }

    @Override
    public Filial salvar(Filial filial) {
        log.info("Salvando a Filial:  " + filial.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO filial(nomeFilial, rua, numero, cidade, estado, e5estrelas) values ('%s','%s','%s','%s','%s','%s')",
                filial.getNomeFilial(), filial.getRua(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.getE5estrelas());

        try{
            statement = connection.createStatement();
            statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next()){
                filial.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return filial;
    }
}
