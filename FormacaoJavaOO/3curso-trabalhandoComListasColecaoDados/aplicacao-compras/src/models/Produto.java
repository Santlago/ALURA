package models;

public class Produto implements Comparable<Produto> {
    
    // attributes
    private double preco;
    private String descricao;

    // constructors
    public Produto(String descricao) {
        this.descricao = descricao;
    }

    // methods
    public String toString() {
        return this.getDescricao() + " - " + this.getPreco();
    }
    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outroProduto.preco));
    }

    // getters and setters
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
