package Aula08_Facade.Mesa_De_Trabalho;


import java.time.LocalDate;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ApiHotel {

    public String listaHotel(LocalDate dataPartida, LocalDate dataRetorno,String cidadeDestino) {
        List<String> hoteis = Arrays.asList("Hilton", "Royal", "Fasano");
        Random r = new Random();
        return hoteis.get(r.nextInt(hoteis.size()));
    }


}
