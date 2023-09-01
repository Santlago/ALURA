package models;

import calculos.Classificavel;

public class Episodio implements Classificavel {
    
    //atributos
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    //getters e setters
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }
    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    //métodos
    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
    
}
