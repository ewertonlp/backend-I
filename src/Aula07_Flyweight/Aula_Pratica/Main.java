package Aula07_Flyweight.Aula_Pratica;

import Aula07_Flyweight.Aula_Pratica.model.Computador;

public class Main {

    public static void main(String[] args) {
        ComputadorFactory computador = new ComputadorFactory();

        Computador mac1 = computador.obterComputador(16,500);
        Computador windows = computador.obterComputador(2,256);
        Computador mac2 = computador.obterComputador(16,500);

        System.out.println(mac2.toString());
        System.out.println(mac1.toString());
        System.out.println(windows.toString());
    }
}
