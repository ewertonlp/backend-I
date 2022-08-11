package Aula08_Facade.Mesa_De_Trabalho;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class FacadeTurismoTest {
    private FacadeTurismo facadeTurismo = new FacadeTurismo();

    private Viagem viagem;

    @BeforeEach
    void doBefore() {
        viagem = new Viagem(LocalDate.of(2022, 10, 15), LocalDate.of(2022,11,15), "São Paulo", "Dubai");
    }

    @Test
    void validarBusca() {
        String busca = String.valueOf(facadeTurismo.buscas(viagem));
        System.out.println(busca);
    }

}
