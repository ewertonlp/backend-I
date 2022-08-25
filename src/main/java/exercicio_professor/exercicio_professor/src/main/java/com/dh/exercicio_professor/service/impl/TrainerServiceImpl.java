package com.dh.exercicio_professor.service.impl;

import com.dh.exercicio_professor.model.Trainer;
import com.dh.exercicio_professor.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service   //--> sinaliza para Spring que é um servico
public class TrainerServiceImpl implements TrainerService {

    @Override
    public List<Trainer> listTrainer(){
        return Arrays.asList(new Trainer("Ewerton"), new Trainer("Ana"));
    }


}
