package models;

public class Filme {
    
    // atributos
    public String nome;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaEmMinutos;

    // metodos
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

    
}
