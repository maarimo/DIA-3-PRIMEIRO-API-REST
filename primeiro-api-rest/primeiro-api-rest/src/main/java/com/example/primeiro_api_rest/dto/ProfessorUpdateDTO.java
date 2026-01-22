package com.example.primeiro_api_rest.dto;

public class ProfessorUpdateDTO {
    String nome;

    public ProfessorUpdateDTO() {
    }

    public ProfessorUpdateDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
