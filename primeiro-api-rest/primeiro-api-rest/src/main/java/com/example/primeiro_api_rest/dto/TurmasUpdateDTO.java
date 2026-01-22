package com.example.primeiro_api_rest.dto;

public class TurmasUpdateDTO {
    String nome;

    public TurmasUpdateDTO() {
    }

    public TurmasUpdateDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
