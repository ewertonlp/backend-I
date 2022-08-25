package com.dh.clinicaOdontologica.service.impl;

import com.dh.clinicaOdontologica.Dao.ConfigurationJDBC;
import com.dh.clinicaOdontologica.model.Usuario;
import com.dh.clinicaOdontologica.service.IUsuarioService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    private ConfigurationJDBC configurationJDBC;



    public UsuarioService(ConfigurationJDBC configurationJDBC) {
        this.configurationJDBC = configurationJDBC;
    }



    @Override
    public void cadastraUsuario(Usuario usuario) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String criarUsuarioSql = "INSERT INTO Usuario(nome, email, senha, nivelAcesso) VALUES(?,?,?,?)";

        try {
            connection = configurationJDBC.conectarComBancoDeDados();
            preparedStatement = connection.prepareStatement(criarUsuarioSql);
            preparedStatement.setString(1,usuario.getNome());
            preparedStatement.setString(2,usuario.getEmail());
            preparedStatement.setString(3,usuario.getSenha());
            preparedStatement.setString(4,usuario.getNivelAcesso());

            preparedStatement.execute();

            preparedStatement.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Usuario> listarTodosUsuario() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String buscarUsuarioSql = "SELECT * FROM Usuario";
        List<Usuario> usuarioList = new ArrayList<>();

        try {
            connection = configurationJDBC.conectarComBancoDeDados();
            preparedStatement = connection.prepareStatement(buscarUsuarioSql);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            while(resultSet.next()) {
                Usuario usuario = new Usuario(
                        resultSet.getString("nome"),
                        resultSet.getString("email"),
                        resultSet.getString("senha"),
                        resultSet.getString("nivelAcesso")
                );
                usuarioList.add(usuario);
            }

            preparedStatement.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarioList;
    }

    @Override
    public void excluirUsuarioById(Integer idUsuario) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String excluirUsuarioById = "DELETE FROM Usuario WHERE idUsuario = ?";

        try {
            connection = configurationJDBC.conectarComBancoDeDados();
            preparedStatement = connection.prepareStatement(excluirUsuarioById);

            preparedStatement.setInt(1,idUsuario);

            preparedStatement.execute();

            preparedStatement.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
