package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfiguracaoJDBC {

    private String jdbcDriver;
    private String dbURL;
    private String ususario;
    private String senha;

    public ConfiguracaoJDBC(String jdbcDriver, String dbURL, String ususario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dbURL = dbURL;
        this.ususario = ususario;
        this.senha = senha;
    }

    public Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName(this.jdbcDriver);
            connection = DriverManager.getConnection(this.dbURL, this.ususario, this.senha);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
