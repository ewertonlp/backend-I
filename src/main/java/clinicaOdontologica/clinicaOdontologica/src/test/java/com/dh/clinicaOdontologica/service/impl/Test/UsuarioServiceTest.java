package com.dh.clinicaOdontologica.service.impl.Test;

import com.dh.clinicaOdontologica.model.Usuario;
import com.dh.clinicaOdontologica.service.impl.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsuarioServiceTest {

    UsuarioService usuarioService;

    @BeforeEach
    void setUp() {

     }

     @Test
    public void cadastrarUsuario() {
        usuarioService.cadastraUsuario("Lucas", "lucas@gmail.com", "1234", "Admin");
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