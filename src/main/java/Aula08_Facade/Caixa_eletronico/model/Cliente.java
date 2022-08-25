package Aula08_Facade.Caixa_eletronico.model;

public class Cliente {

    private String id;
    private String senha;
    private String saldo;

    public Cliente(String id, String senha, String saldo) {
        this.id = id;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", senha='" + senha + '\'' +
                ", saldo='" + saldo + '\'' +
                '}';
    }
}
