package com.example.professorHibernate.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Professor") //defini o nome da tabela
public class ProfessorModel {

    @Id
    @SequenceGenerator(name = "professor_sequence", sequenceName = "professor_Sequence", allocationSize = 1) //criar e controlar toda a criação dos Id´s
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professor_sequence") // será a forma que essa sequencia será gerada
    private Long id;
    private String nome;
    private String titulo;

    @OneToMany(mappedBy = "professorModel", fetch = FetchType.LAZY) //fetch indica qdo trouxer os professores não trarão os alunos junto pois teria tráfego grnade de dados
    private Set<AlunoModel> alunos = new HashSet<>();

    public ProfessorModel() {

    }

    public ProfessorModel(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }


    //somente o getId


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
