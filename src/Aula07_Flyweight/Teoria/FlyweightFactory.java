package Aula07_Flyweight.Teoria;

import java.util.HashMap;

public class FlyweightFactory {

    private static final HashMap<String, Circulo> circuloMap = new HashMap<>();

    static Circulo obterCirculo(String cor) {
        Circulo circulo = circuloMap.get(cor);

        if(circulo == null) {
            circulo = new Circulo(cor);
            circuloMap.put(cor, circulo);
            System.out.println("Criar um círculo de cor: " + cor);
        }
        return circulo;
    }
}
