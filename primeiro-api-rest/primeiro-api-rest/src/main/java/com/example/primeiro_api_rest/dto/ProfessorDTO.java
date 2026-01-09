package com.example.primeiro_api_rest.dto;

public class ProfessorDTO {
    private Long id;
    private String nome;

    public ProfessorDTO() {
    }

    public ProfessorDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
