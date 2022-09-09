package Dao;

import model.Filme;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IDao<T> {

    Filme salvar(Filme filme) throws SQLException;

    public List<T> buscarTodos() throws SQLException;

    public void alterar(T t) throws SQLException;

    public Optional<T> buscarPorId(int id) throws SQLException;

    public void excluir(int id) throws SQLException;

}
