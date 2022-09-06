package com.dh.clinicaOdontologica.Dao.IMPL;

import com.dh.clinicaOdontologica.Dao.ConfigurationJDBC;
import com.dh.clinicaOdontologica.Dao.IUsuarioDAO_H2;
import com.dh.clinicaOdontologica.model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO_H2 implements IUsuarioDAO_H2<Usuario> {

    ConfigurationJDBC configurationJDBC;

    public UsuarioDAO_H2(ConfigurationJDBC configurationJDBC) {
        this.configurationJDBC = configurationJDBC;
    }

    @Override
    public Usuario cadastraUsuario(String nome, String email, String senha, String nivelAcesso) {
        Usuario usuario = new Usuario(nome, email, senha, nivelAcesso);
        Connection connection = null;
        Statement statement = null;
        String criarUsuarioSql = String.format("INSERT INTO Usuario(nome, email, senha, nivelAcesso) " +
                "VALUES('%s', '%s', '%s', '%s')", usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getNivelAcesso()) ;

        try {
            connection = configurationJDBC.conectarComBancoDeDados();
            statement = connection.createStatement();
            statement.executeUpdate(String.valueOf(criarUsuarioSql), Statement.RETURN_GENERATED_KEYS);
            ResultSet idUsuario = statement.getGeneratedKeys();
            if(idUsuario.next()){
                usuario.setIdUsuario(idUsuario.getInt("idUsuario"));
                statement.close();
                connection.close();
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
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
    public String excluirUsuarioById(Integer idUsuario) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String excluirUsuarioById = "DELETE FROM Usuario WHERE idUsuario = ?";
        String exlusaoBemSucedida = "Usuario com o id: " + idUsuario + " exlcuido com sucesso!";

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

        return exlusaoBemSucedida;
    }
}
