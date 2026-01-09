package com.example.primeiro_api_rest.entity;

import jakarta.persistence.*;

@Entity
public class TurmasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private ProfessorEntity professor;

    public TurmasEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProfessorEntity getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorEntity professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "TurmasEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professor=" + professor +
                '}';
    }
}
