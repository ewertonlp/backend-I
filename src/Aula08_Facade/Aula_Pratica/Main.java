package Aula08_Facade.Aula_Pratica;

public class Main {

    public static void main(String[] args) {
        FacadeDesconto facadeDesconto = new FacadeDesconto();

        Cartao cartao = new Cartao("3214654125879632", "Star Bank");
        Produto produto = new Produto("Ervilhas", "Lata");

        System.out.println("\nDesconto: "+facadeDesconto.desconto(cartao, produto,1));
    }
}
