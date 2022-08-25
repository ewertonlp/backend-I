package Aula01.mesa01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {

    @Test
    void calcularRaio() {

        Circulo c1 = new Circulo(2.8);
        Quadrado q1 = new Quadrado(5.4);

        c1.calcularPerimetro();
        q1.calcularPerimetro();

        System.out.println("Raio: " + c1);

    }
}