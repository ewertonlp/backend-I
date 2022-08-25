package com.dh.clinicaOdontologica.service.impl.Test;

import com.dh.clinicaOdontologica.model.Usuario;
import com.dh.clinicaOdontologica.service.impl.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioServiceTest {

    UsuarioService usuarioService;

    @BeforeEach
    void setUp() {

     }

     @Test
    public void cadastrarUsuario() {
        Usuario usuario = new Usuario("Lucas", "lucas@gmail.com", "1234", "Admin");
        usuarioService.cadastraUsuario(usuario);
     }

     @Test
    public void buscarTodosUsuarios() {
        assertEquals(1,usuarioService.listarTodosUsuario().size());
     }

     @Test
    public void excluirUsuarioById() {
        usuarioService.excluirUsuarioById(1);
     }
}