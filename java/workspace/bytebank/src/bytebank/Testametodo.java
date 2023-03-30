package bytebank;

public class Testametodo {

	public static void main(String[] args) {
		Conta contaDoPaulo  = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.depoosita(50);
		System.out.println(contaDoPaulo.saldo);
	}
}
