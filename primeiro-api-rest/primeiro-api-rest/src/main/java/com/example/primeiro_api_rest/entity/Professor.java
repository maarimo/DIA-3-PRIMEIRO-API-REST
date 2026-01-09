package com.example.primeiro_api_rest.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Id
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private List<TurmasEntity> turmas = new ArrayList<>();

    public Professor() {
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

    public List<TurmasEntity> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<TurmasEntity> turmas) {
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", turmas=" + turmas +
                '}';
    }
}
