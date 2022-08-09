package Aula08_Facade.Mesa_De_Trabalho;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacadeTurismoTest {

    private FacadeTurismo facadeTurismo = new FacadeTurismo();

    private Voo voo;
    private Hotel hotel;

    @BeforeEach
    void doBefore() {
        voo  = new Voo("2022/08/12", "2022/09/30", "Fortaleza");
        hotel = new Hotel("2022/08/12", "2022/09/30", "Fortaleza");
    }

    @Test
    void validarBusca() {
        voo.setDataPartida("2022/08/12");
        voo.setDataRetorno("2022/09/30");
        voo.setLocalidade("Fortaleza");
    }

}
