package com.example.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_pesquisador")
public class Pesquisador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(length = 100)
    private String especialidade;

    @OneToMany(mappedBy = "pesquisador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Observacao> observacoes = new ArrayList<>();

    // Construtor
    public Pesquisador(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Construtor padrão exigido pela JPA
    public Pesquisador() {
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Observacao> getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(List<Observacao> observacoes) {
        this.observacoes = observacoes;
    }

    public void adicionarObservacao(Observacao observacao) {
        this.observacoes.add(observacao);
        observacao.setPesquisador(this); // Estabelece a relação bidirecional
    }
    @Override
    public String toString() {
    return this.nome; // Retorne apenas o nome do pesquisador
}
}
