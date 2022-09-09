package com.example.professorHibernate.model;


import javax.persistence.*;

@Entity
@Table(name = "Aluno")
public class AlunoModel {

    @Id
    @SequenceGenerator(name = "aluno_sequence", sequenceName = "aluno_Sequence", allocationSize = 1) //criar e controlar toda a criação dos Id´s
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_sequence") // será a forma que essa sequencia será gerada
    private Long id;
    private String nome;
    private String idade;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE) //são vários alunos para 1 professor. CascadeType.Remove --> quando remover o professor, todos os alunos que estiverem associados ao professor também serão removidos.
    @JoinColumn(name = "professor_id") // onde faz o JOIN com a tabela professor
    private ProfessorModel professorModel;

    public AlunoModel() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
