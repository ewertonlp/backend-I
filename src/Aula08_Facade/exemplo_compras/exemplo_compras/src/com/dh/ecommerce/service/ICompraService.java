package Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.service;

import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.model.Cartao;
import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.model.Endereco;


public interface ICompraService {

    public void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco);
}
