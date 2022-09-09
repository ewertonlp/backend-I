package com.dh.clinicaOdontologica.Dao;

import com.dh.clinicaOdontologica.model.Usuario;

import java.util.List;

public interface IUsuarioDAO_H2 <T> {

    public T cadastraUsuario(String nome, String email, String senha, String nivelAcesso);

    List<T> listarTodosUsuario();

    public String excluirUsuarioById(Integer idUsuario);
}
