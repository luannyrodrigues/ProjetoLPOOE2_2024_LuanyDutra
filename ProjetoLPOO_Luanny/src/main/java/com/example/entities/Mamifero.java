package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_mamifero")
public class Mamifero extends Animal {

    @Column(name = "possui_pelo")
    private boolean possuiPelo;

    @Column(name = "periodo_gestacao")
    private int periodoGestacao; // em dias

    @Column(name = "dieta", length = 50)
    private String dieta; //herbívoro, carnívoro, onívoro

    public Mamifero(String nome, String nomeCientifico, String status, boolean possuiPelo, int periodoGestacao, String dietaAlimentar) {
        super(nome, nomeCientifico, status);
        this.possuiPelo = possuiPelo;
        this.periodoGestacao = periodoGestacao;
        this.dieta = dietaAlimentar;
    }

    // Construtor padrão exigido pela JPA
    public Mamifero() {

    }

    // Getters e Setters
    public boolean isPossuiPelo() {
        return possuiPelo;
    }

    public void setPossuiPelo(boolean possuiPelo) {
        this.possuiPelo = possuiPelo;
    }

    public int getPeriodoGestacao() {
        return periodoGestacao;
    }

    public void setPeriodoGestacao(int periodoGestacao) {
        this.periodoGestacao = periodoGestacao;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    
    
}
