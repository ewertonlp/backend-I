package com.example.orm1.repository;

import com.example.orm1.entity.EstudanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudanteRepository extends JpaRepository<EstudanteEntity, Long> {
}
