package com.example.orm1.service;

import java.util.List;
import java.util.Optional;

public interface IEstudanteService <T> {

    public List<T> findAllEstudante();
    public Optional<T> findEstudanteById(Long id);  // verificação de recurso do Java no caso buscar por Id
    public T addEstudante(T t);
    public String deleteEstudante(Long id);
    public String updateEstudante(T t);
}
