package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_reptil")
public class Reptil extends Animal {

    @Column(name = "venenoso")
    private boolean venenoso;

    @Column(name = "temperatura_ideal")
    private double temperaturaIdeal;

    @Column(name = "tipo_reproducao", length = 50)
    private String tipoReproducao;

    public Reptil(String nome, String nomeCientifico, String status, boolean venenoso, double temperatura, String reproducao) {
        super(nome, nomeCientifico, status);
        this.venenoso = venenoso;
        this.temperaturaIdeal = temperatura;
        this.tipoReproducao = reproducao;
    }

    public Reptil() {

    }


    // Getters e Setters
    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public double getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    public void setTemperaturaIdeal(double temperaturaIdeal) {
        this.temperaturaIdeal = temperaturaIdeal;
    }

    public String getTipoReproducao() {
        return tipoReproducao;
    }

    public void setTipoReproducao(String tipoReproducao) {
        this.tipoReproducao = tipoReproducao;
    }
}
