package com.dh.clinicaOdontologica.service.impl;

import com.dh.clinicaOdontologica.Dao.ConfigurationJDBC;
import com.dh.clinicaOdontologica.Dao.IMPL.UsuarioDAO_H2;
import com.dh.clinicaOdontologica.model.Usuario;
import com.dh.clinicaOdontologica.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    private final UsuarioDAO_H2 usuarioDAO_h2;

    @Autowired
    public UsuarioService() {
        this.usuarioDAO_h2 = new UsuarioDAO_H2(new ConfigurationJDBC());
    }


    @Override
    public String cadastraUsuario(String nome, String email, String senha, String nivelAcesso) {
        return "Usuário: " + usuarioDAO_h2.cadastraUsuario(nome, email, senha, nivelAcesso).toString()
                + " criado com sucesso!";
    }

    @Override
    public List<Usuario> listarTodosUsuario() {
        return usuarioDAO_h2.listarTodosUsuario();
    }

    @Override
    public String excluirUsuarioById(Integer idUsuario) {
       return  usuarioDAO_h2.excluirUsuarioById(idUsuario);
    }
}
