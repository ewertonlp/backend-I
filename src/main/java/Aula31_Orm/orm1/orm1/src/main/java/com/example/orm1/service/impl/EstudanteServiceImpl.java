package com.example.orm1.service.impl;

import com.example.orm1.entity.EstudanteEntity;
import com.example.orm1.repository.IEstudanteRepository;
import com.example.orm1.service.IEstudanteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteServiceImpl implements IEstudanteService<EstudanteEntity> {

    private final IEstudanteRepository estudanteRepository;

    public EstudanteServiceImpl(IEstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }

    @Override
    public List<EstudanteEntity> findAllEstudante(){
        return estudanteRepository.findAll();
    }

    @Override
    public Optional<EstudanteEntity> findEstudanteById(Long id) {
        return estudanteRepository.findById(id);
    }

    @Override
    public EstudanteEntity addEstudante(EstudanteEntity estudanteEntity) {
        if (estudanteEntity != null) {
            return (EstudanteEntity) estudanteRepository.save(estudanteEntity);
        }
        return new EstudanteEntity();
    }

    @Override
    public String deleteEstudante(Long id) {
        if (estudanteRepository.findById(id).isPresent()) {
            estudanteRepository.deleteById(id);
            return "Estudante excluído.";
        }
        return "Estudante não localizado.";
    }

    @Override
    public String updateEstudante(EstudanteEntity estudanteEntity) {
        if(estudanteEntity != null && estudanteRepository.findById(estudanteEntity.getId()).isPresent()){
            estudanteRepository.saveAndFlush(estudanteEntity);
            return "Estudante atualizado.";

        }
        return "Não foi possível realizar a atualização do estudante.";
    }
}
