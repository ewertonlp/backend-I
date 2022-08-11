package Aula08_Facade.Mesa_De_Trabalho;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        FacadeTurismo facadeTurismo = new FacadeTurismo();

        Viagem viagem1 = new Viagem(LocalDate.of(2022,10,15), LocalDate.of(2022, 10, 15), "São Paulo", "Dubai");
        Viagem viagem2 = new Viagem(LocalDate.of(2022,11,15), LocalDate.of(2022, 12, 20), "São Paulo", "Bali");


        System.out.println(facadeTurismo.buscas(viagem1));
        System.out.println(facadeTurismo.buscas(viagem2));

    }
}
