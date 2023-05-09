package calculos;

import models.Titulo;

public class CalculadoraDeTempo {
    
    //atributos
    private int tempoTotal = 0;

    //getters e setters
    public int getTempoTotal() {
        return this.tempoTotal;
    }

    //métodos
    public void inclui(Titulo titulo /*Cabe tanto filme quanto série (polimorfismo) */) {
        this.tempoTotal += titulo.getDuracaEmMinutos();
    }
    // public void inclui(Filme f) {
    //     this.tempoTotal += f.getDuracaEmMinutos();
    // }

    // public void inclui(Serie s) {
    //     this.tempoTotal += s.getDuracaEmMinutos();
    // }
    
}
