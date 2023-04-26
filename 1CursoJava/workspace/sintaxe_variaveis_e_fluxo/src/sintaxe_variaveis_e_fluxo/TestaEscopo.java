package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 18;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = true;
		//boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;
		
		if (quantidadePessoas >=2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor acompanhado: " + acompanhado);
		if (idade >= 18 && acompanhado /*não precisa de colocar = true*/) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
	}
}
