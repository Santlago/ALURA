package models;

import com.google.gson.annotations.SerializedName;

import exceptions.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {
    // atributos
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaEmMinutos;

    // constructors
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meTituloOmdb) {
        this.nome = meTituloOmdb.title();

        if (meTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meTituloOmdb.year());
        this.duracaEmMinutos = Integer.valueOf(meTituloOmdb.runtime().substring(0, 2));
    }

    // metodos
    @Override
    public int compareTo(Titulo outroTitulo) {
        // TODO Auto-generated method stub
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + ", duracaoEmMinutos=" + duracaEmMinutos + ")";
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    // getters e setters
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getDuracaEmMinutos() {
        return duracaEmMinutos;
    }

    public void setDuracaEmMinutos(int duracaEmMinutos) {
        this.duracaEmMinutos = duracaEmMinutos;
    }
}
