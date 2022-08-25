package Aula02_Design_Patterns;

public abstract class Funcionario {

    private String nome;
    private String sobrenome;
    private String numeroConta;

    public Funcionario(String nome, String sobrenome, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }

    //metodo
    public void pagamentoSalario() {
        double quantia;
        quantia = calcularSaldo();
        imprimirRecibo(quantia);
        depositar(quantia);
    }

    public abstract double calcularSaldo(); // só pode haver metodos abstratos se a classe for abstratos
    public abstract void imprimirRecibo(double quantia);

    public abstract void depositar(double quantia);
}
