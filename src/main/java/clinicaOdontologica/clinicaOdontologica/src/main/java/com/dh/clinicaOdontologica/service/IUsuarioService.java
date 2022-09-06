package com.dh.clinicaOdontologica.service;

import com.dh.clinicaOdontologica.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public String cadastraUsuario(String nome, String email, String senha, String nivelAcesso);

    List<Usuario> listarTodosUsuario();

    public String excluirUsuarioById(Integer idUsuario);
}
