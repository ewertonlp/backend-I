package Aula08_Facade.Caixa_eletronico.service;

import Aula08_Facade.Caixa_eletronico.model.Cliente;

public interface ISacarService {

    public void sacarDinheiro(String id, String senha, String saldo);
}
