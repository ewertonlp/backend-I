package com.example.mesaTrabalhoOrm.service;

import java.util.List;
import java.util.Optional;

public interface IProdutoService <T> {

    public List<T> findAllProduto();
    public Optional<T> findProdutoById(Long id);
    public T addProduto(T t);
    public String deleteProduto(Long id);
    public String updateProduto(T t);
}
