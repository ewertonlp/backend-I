package com.example.mesaTrabalhoOrm.repository;

import com.example.mesaTrabalhoOrm.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
