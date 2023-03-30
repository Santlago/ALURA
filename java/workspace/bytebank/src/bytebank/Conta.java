package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//método:
	public void depoosita(double valor) {
		this.saldo = saldo + valor;
	}
}