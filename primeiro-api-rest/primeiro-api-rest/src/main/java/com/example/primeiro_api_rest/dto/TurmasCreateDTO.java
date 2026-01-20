package com.example.primeiro_api_rest.dto;

public class TurmasCreateDTO {
    private String nome;
    private Long professorId;

    public TurmasCreateDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }
}

