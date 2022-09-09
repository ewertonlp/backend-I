package com.example.esporteHQL.repository;

import com.example.esporteHQL.model.JogadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JogadorRepository extends JpaRepository<JogadorModel, Long> {

    @Query("select jogador j from Jogador where j.nome = ?1") // ?1 pega exatamente o nome que eu passar no findJogadorByName
    Optional<JogadorModel> findJogadorByName(String name);


}
