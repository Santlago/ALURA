package models;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
    // attributes
    private double total;
    private List<Produto> listaCarrinho;

    // constructors
    public Carrinho() {
        this.listaCarrinho = new ArrayList<>();
    }

    // methods
    public void adiciona(double valor) {
        this.total += valor;
    }

    // getters and setters
    public double getTotal() {
        return total;
    }
    public List<Produto> getListaCarrinho() {
        return listaCarrinho;
    }  
}
