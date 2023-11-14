package com.example.todoservice;
import java.time.LocalDate;

public class Task {
    private Long id;
    private String descricao;
    private LocalDate dataDeVencimento;
    private boolean concluida;

    public Task() {
    }

    public Task(Long id, String descricao, LocalDate dataDeVencimento, boolean concluida) {
        this.id = id;
        this.descricao = descricao;
        this.dataDeVencimento = dataDeVencimento;
        this.concluida = concluida;
    }

    // Getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}

