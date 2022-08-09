package Aula08_Facade.Caixa_eletronico.service.impl;

import Aula08_Facade.Caixa_eletronico.service.ISacarService;

public class AutenticationService implements ISacarService {

    public Boolean validadeUserAndPassword(String id, String senha) {
        Boolean usuarioAutenticado = Boolean.FALSE;
        if(id != null && senha != null) {
            System.out.println("Usuário Autenticado");
        } else {
            System.out.println("Conta não localizada");
        }
        return usuarioAutenticado;
    }

    @Override
    public void sacarDinheiro(String id, String senha, String saldo) {

    }
}
