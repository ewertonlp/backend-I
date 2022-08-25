package com.dh.clinicaOdontologica.service;

import com.dh.clinicaOdontologica.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void cadastraUsuario(Usuario usuario);

    List<Usuario> listarTodosUsuario();

    public void excluirUsuarioById(Integer idUsuario);
}
