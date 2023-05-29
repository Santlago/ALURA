package models;

public class Audio {
    
    // atributes
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;
    
    // methods
    public void curte() {
        this.totalCurtidas++;
    }
    public void reproduz() {
        this.totalReproducoes++;
    }
    
    // getters e setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTotalReproducoes() {
        return totalReproducoes;
    }
    public int getTotalCurtidas() {
        return totalCurtidas;
    }
    public int getClassificacao() {
        return classificacao;
    }
    
    
}
