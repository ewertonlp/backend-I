package Aula08_Facade.Mesa_De_Trabalho;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ApiVoo {

    public String listaVoo(LocalDate dataPartida, LocalDate dataRetorno, String cidadeOrigem, String cidadeDestino) {
        List<String> voos = Arrays.asList("Qatar", "Emirates", "Air France");
        Random r = new Random();
        return voos.get(r.nextInt(voos.size()));
    }


}
