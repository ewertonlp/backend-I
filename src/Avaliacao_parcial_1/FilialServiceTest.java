package Avaliacao_parcial_1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class FilialServiceTest {

    FilialService filialService;

    @BeforeEach
    void doBefore(){
        filialService = new FilialService(new FilialDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void cadastrandoFilial() {
        Filial filial = new Filial("Copacabana", "Av Atlantica", 1000, "Rio de Janeiro", "RJ", true);
        filialService.salvar(filial);
        assertTrue(filial.getId()!=null);
        assertEquals(true, filial.getE5estrelas());

        Filial filial1 = new Filial("Ibis", "Av Paulista", 1500, "São Paulo", "SP", true);
        filialService.salvar(filial1);
        assertTrue(filial1.getId()!=null);
        assertEquals(true, filial1.getE5estrelas());

        Filial filial2 = new Filial("Hilton", "Rua 13 de Maio", 140, "São Paulo", "SP", false);
        filialService.salvar(filial2);
        assertTrue(filial2.getId()!=null);
        assertEquals(false, filial2.getE5estrelas());

        Filial filial3 = new Filial("Plaza", "Rua São João", 140, "Salvador", "BA", true);
        filialService.salvar(filial3);
        assertTrue(filial3.getId()!=null);
        assertEquals(true, filial3.getE5estrelas());

        Filial filial4 = new Filial("Centro", "Rua America", 250, "Sao Paulo", "SP", false);
        filialService.salvar(filial4);
        assertTrue(filial4.getId()!=null);
        assertEquals(false, filial4.getE5estrelas());
    }



}
