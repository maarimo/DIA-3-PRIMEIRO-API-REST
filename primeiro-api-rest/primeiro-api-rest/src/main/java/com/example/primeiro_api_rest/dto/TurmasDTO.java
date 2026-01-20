package com.example.primeiro_api_rest.dto;

public class TurmasDTO {
    private Long id;
    private String nome;

    public TurmasDTO() {
    }

    public TurmasDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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
}
