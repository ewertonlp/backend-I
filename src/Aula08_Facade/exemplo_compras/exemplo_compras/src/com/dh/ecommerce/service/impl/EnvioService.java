package Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.service.impl;

import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.model.Endereco;
import Aula08_Facade.exemplo_compras.exemplo_compras.src.com.dh.ecommerce.model.Produto;


import java.util.List;

public class EnvioService {
    public void processarEnvio(List<Produto> produtos, Endereco endereco){
        System.out.println("Enviando produtos a " + endereco.getRua() +" "+ endereco.getNro() +","+ endereco.getBairro());
    }
}
