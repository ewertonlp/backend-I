package Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce;


import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.model.Cartao;
import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.model.Endereco;
import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.model.Produto;
import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.service.ICompraService;
import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.service.impl.ArmazemService;
import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.service.impl.CompraService;
import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.service.impl.EnvioService;
import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.service.impl.PgtoService;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Produto produtoUm = new Produto("1",5,1000,"Mouse");
        Produto produtoDois = new Produto("2",5,3000,"Teclado");
        Cartao cartao = new Cartao("1111222233334444","012","2025/07/09");

        Endereco endereco = new Endereco("Av Morumbi","1500","14280000","Morumbi","São Paulo");
        ICompraService compraService = new CompraService(new ArmazemService(Arrays.asList(produtoUm,produtoDois)),new PgtoService(),new EnvioService());

        compraService.processarCompra("1",3, cartao, endereco);
    }
}
