package atributo_estatico;

public class Carro {
	
	//atributos
	private String modelo;
	private int ano;
	private double preco;
	
	//construtores
	public Carro(String modelo, int ano, double preco) {
		if ((modelo != null) && (ano >= 1891) && (preco > 0)) {
			this.modelo = modelo;
			this.ano = ano;
			this.preco = preco;
		} else {
			System.out.println("Algum valor ou mais foi digitado incorretamente! ");
		}
	}
	
	public Carro(String modelo, int ano) {
		this(modelo, ano, 99999);
	}
	
	//getters e setters
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}

