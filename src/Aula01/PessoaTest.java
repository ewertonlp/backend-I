package Aula01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<String> colecao = new ArrayList<String>();

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Ewerton", "Lopes");
        p1.setIdade(LocalDate.of(2016, 3, 23));

        p2 = new Pessoa("Ton", "Lopes");
        p2.setIdade(LocalDate.of(1996, 5, 10));

        p3 = new Pessoa("Bob", "Marley");
        p3.setIdade(LocalDate.of(1962, 12, 4));

        p4 = new Pessoa("Cecilia", "Meirelles");
        p4.setIdade(LocalDate.of(1925, 3, 23));

        p5 = new Pessoa("Raul", "Seixas");
        p5.setIdade(LocalDate.of(1948, 10, 10));

        p6 = new Pessoa("Sabrina", "Sato");
        p6.setIdade(LocalDate.of(1993, 4, 20));

        p7 = new Pessoa("Ewerton", "Lopes");
        p7.setIdade(LocalDate.of(2016, 3, 23));

        p8 = new Pessoa("Ewerton", "Lopes");
        p8.setIdade(LocalDate.of(2016, 3, 23));

        p9 = new Pessoa("Paul", "Maccartney");
        p9.setIdade(LocalDate.of(2016, 12, 8));

        p10 = new Pessoa("Ewerton", "Lopes");
        p10.setIdade(LocalDate.of(2016, 3, 23));
    }

    @Test
    void imprimirObjetos() {
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void adicionarColecao() {
        p1.adicionarNomes(p1);
        p2.adicionarNomes(p2);
        p3.adicionarNomes(p3);
        p4.adicionarNomes(p4);
        p5.adicionarNomes(p5);
        p6.adicionarNomes(p6);
        p7.adicionarNomes(p7);
        p8.adicionarNomes(p8);
        p9.adicionarNomes(p9);
        p10.adicionarNomes(p10);
    }
}
