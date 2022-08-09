package Aula08_Facade.Aula_Pratica;

public class ApiQuantidade {

    public int desconto(int quantidade) {
        if(quantidade > 11) {
            return 15;
        } else {
            return 0;
        }
    }
}
