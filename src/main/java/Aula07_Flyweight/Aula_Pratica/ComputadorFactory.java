package Aula07_Flyweight.Aula_Pratica;

import Aula07_Flyweight.Aula_Pratica.model.Computador;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {

    private static final Map<String, Computador> macFlyweight = new HashMap<>();

    public Computador obterComputador(int ram, int hd) {
        String id = "id "+ram+" : "+hd;
        System.out.println(id);

        if(!macFlyweight.containsKey(id)) {
            macFlyweight.put(id, new Computador(ram, hd));
            System.out.println("\nComputador criado com sucesso.");
        return macFlyweight.get(id);
        }
        System.out.println("\nComputador obtido");
        return macFlyweight.get(id);
    }
}
