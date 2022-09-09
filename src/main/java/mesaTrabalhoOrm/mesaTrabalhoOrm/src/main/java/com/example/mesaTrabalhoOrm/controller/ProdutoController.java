package com.example.mesaTrabalhoOrm.controller;

import com.example.mesaTrabalhoOrm.entity.ProdutoEntity;
import com.example.mesaTrabalhoOrm.service.impl.ProdutoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class ProdutoController {

    private final ProdutoServiceImpl produtoService;

    public ProdutoController(ProdutoServiceImpl produtoService) {
        this.produtoService = produtoService;
    }

    @RequestMapping(value = "/produto", method = RequestMethod.GET,produces = "application/json")
    public List<ProdutoEntity> buscarTodosProdutos() {
        return produtoService.findAllProduto();
    }

    @GetMapping("/produto/{id}")
    public Optional<ProdutoEntity> buscarProdutoPorId(@PathVariable Long id) {
        return produtoService.findProdutoById(id);
    }

    @PostMapping("/produto/adicionar")
    public ProdutoEntity adicionarProduto(@RequestBody ProdutoEntity produtoEntity) {
        return produtoService.addProduto(produtoEntity);
    }

    @DeleteMapping("/produto/delete/{id}")
    public String deleteProduto(@PathVariable Long id) {
        return produtoService.deleteProduto(id);
    }

    @PutMapping("/produto/atualizar")
    public String atualizarProduto(@RequestBody ProdutoEntity produtoEntity) {
        return produtoService.updateProduto(produtoEntity);
    }


}
