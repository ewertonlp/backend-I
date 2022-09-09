package com.dh.clinicaOdontologica.controller;

import com.dh.clinicaOdontologica.model.Usuario;
import com.dh.clinicaOdontologica.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listarTodosUsuarios(){
        return usuarioService.listarTodosUsuario();
    }

    @GetMapping("/cadastra")
    public String cadastraUsuario(@RequestParam String nome, @RequestParam String email,
                                  @RequestParam String senha, @RequestParam String nivelAcesso){
       return usuarioService.cadastraUsuario(nome, email, senha, nivelAcesso);
    }

    @GetMapping("/delete/{idUsuario}")
    public String deletaUsuarioById(@PathVariable Integer idUsuario){
        return usuarioService.excluirUsuarioById(idUsuario);
    }

}
