package models;

public class Podcast extends Audio {

    // attributes
    private String apresentador;
    private String descricao;
    
    // getters and setters
    public String getApresentador() {
        return apresentador;
    }
    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
