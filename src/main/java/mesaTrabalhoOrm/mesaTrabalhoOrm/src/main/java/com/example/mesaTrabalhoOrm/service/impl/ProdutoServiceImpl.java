package com.example.mesaTrabalhoOrm.service.impl;

import com.example.mesaTrabalhoOrm.entity.ProdutoEntity;
import com.example.mesaTrabalhoOrm.repository.IProdutoRepository;
import com.example.mesaTrabalhoOrm.service.IProdutoService;

import java.util.List;
import java.util.Optional;

public class ProdutoServiceImpl implements IProdutoService<ProdutoEntity> {

    private final IProdutoRepository produtoRepository;

    public ProdutoServiceImpl(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<ProdutoEntity> findAllProduto() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<ProdutoEntity> findProdutoById(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public ProdutoEntity addProduto(ProdutoEntity produtoEntity) {
        if (produtoEntity != null) {
            return (ProdutoEntity) produtoRepository.save(produtoEntity);
        }
        return new ProdutoEntity();
    }

    @Override
    public String deleteProduto(Long id) {
        if (produtoRepository.findById(id).isPresent()) {
            produtoRepository.deleteById(id);
            return "Produto excluído.";
        }
        return "Produto não localizado.";
    }

    @Override
    public String updateProduto(ProdutoEntity produtoEntity) {
        if(produtoEntity != null && produtoRepository.findById(produtoEntity.getId()).isPresent()) {
            produtoRepository.saveAndFlush(produtoEntity);
            return "Produto atualizado.";
        }
        return "Não foi possível realizar a atualização do produto.";
    }
}
