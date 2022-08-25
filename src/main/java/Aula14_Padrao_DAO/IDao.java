package Aula14_Padrao_DAO;

public interface IDao <T> {

    public T salvar(T t);
    public T buscar(Integer id);



}
