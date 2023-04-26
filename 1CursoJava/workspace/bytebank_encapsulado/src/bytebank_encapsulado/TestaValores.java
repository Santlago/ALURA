package bytebank_encapsulado;

public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		Conta conta2 = new Conta(1337, 2345);
		Conta conta3 = new Conta(1337, 15631);
		Conta conta4 = new Conta(1337, 15334);
		
		System.out.println(Conta.getTotal());
	}
}
