package Aula08_Facade.Aula_Pratica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeDescontoTest {

    private FacadeDesconto facadeDesconto = new FacadeDesconto();
    private Cartao cartao;
    private Produto produto;

    @BeforeEach
    void doBefore() {
        cartao = new Cartao("3214654125879632", "Star Bannk");
        produto = new Produto("Ervilhas", "Lata");
    }

    @Test
    void validarDescontoBancoTest() {
        produto.setTipo("Enlatado");

        int desconto = facadeDesconto.desconto(cartao, produto, 1);
        assertEquals(20, desconto);
    }

    @Test
    void validarDescontoProdutoTest() {
        cartao.setBanco("Itau");

        int desconto = facadeDesconto.desconto(cartao, produto, 1);
        assertEquals(10, desconto);
    }

    @Test
    void validarDescontoQuantidadeTest() {
        produto.setTipo("Enlatado");
        cartao.setBanco("Itau");

        int desconto = facadeDesconto.desconto(cartao, produto, 12);

        assertEquals(15, desconto);
    }

    @Test
    void validarDescontoTotalTest() {

        int desconto = facadeDesconto.desconto(cartao,produto, 12);
        assertEquals(45, desconto);
    }
}
