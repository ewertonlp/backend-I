package com.example.orm1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EstudanteEntity {

    @Id // indica que o atributa será um id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //os valres que serão recebeido serão sequenciais = auto increment
    private Long id;
    private String codigoEstudante;
    private String nome;
    private String sobrenome;

    public EstudanteEntity(Long id, String codigoEstudante, String nome, String sobrenome) {
        this.id = id;
        this.codigoEstudante = codigoEstudante;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // construtor sem o Id
    public EstudanteEntity(String codigoEstudante, String nome, String sobrenome) {
        this.codigoEstudante = codigoEstudante;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public EstudanteEntity() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoEstudante() {
        return codigoEstudante;
    }

    public void setCodigoEstudante(String codigoEstudante) {
        this.codigoEstudante = codigoEstudante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
