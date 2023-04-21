package atributo_estatico;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro marea = new Carro("Marea", 2009, 7500);
		System.out.println("Modelo: " + marea.getModelo() + "\nAno: " + marea.getAno() + "\nPreco: " + marea.getPreco());
		
		Carro civic = new Carro("Civic", 2012);
		System.out.println("\nModelo: " + civic.getModelo() + "\nAno: " + civic.getAno() + "\nPreco: " + civic.getPreco());
	}
}
