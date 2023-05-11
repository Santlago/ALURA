package models;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    
    //atributos
    private String diretor;

    //getters e setters
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
