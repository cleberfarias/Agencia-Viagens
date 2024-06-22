package com.example.Agencia_De_Viagens.entity;

import jakarta.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "destinos")
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String pais;
    private String cidade;
    private String[] fotos;
    private String[] atracoes;
    private float avaliacaoMedia;
    private int numeroAvaliacoes;

    // Construtor padrão
    public Destino() {
    }

    // Construtor com parâmetros
    public Destino(Long id, String nome, String descricao, String pais, String cidade, String[] fotos, String[] atracoes, float avaliacaoMedia, int numeroAvaliacoes) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.pais = pais;
        this.cidade = cidade;
        this.fotos = fotos;
        this.atracoes = atracoes;
        this.avaliacaoMedia = avaliacaoMedia;
        this.numeroAvaliacoes = numeroAvaliacoes;
    }

    // Getters e setters para todos os atributos

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String[] getFotos() {
        return fotos;
    }

    public void setFotos(String[] fotos) {
        this.fotos = fotos;
    }

    public String[] getAtracoes() {
        return atracoes;
    }

    public void setAtracoes(String[] atracoes) {
        this.atracoes = atracoes;
    }

    public float getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public void setAvaliacaoMedia(float avaliacaoMedia) {
        this.avaliacaoMedia = avaliacaoMedia;
    }

    public int getNumeroAvaliacoes() {
        return numeroAvaliacoes;
    }

    public void setNumeroAvaliacoes(int numeroAvaliacoes) {
        this.numeroAvaliacoes = numeroAvaliacoes;
    }

    @Override
    public String toString() {
        return "Destino{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", pais='" + pais + '\'' +
                ", cidade='" + cidade + '\'' +
                ", fotos=" + Arrays.toString(fotos) +
                ", atracoes=" + Arrays.toString(atracoes) +
                ", avaliacaoMedia=" + avaliacaoMedia +
                ", numeroAvaliacoes=" + numeroAvaliacoes +
                '}';
    }
}
