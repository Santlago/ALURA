/*Nome: Breno Lemes Santiago - RM:552270
 Nome: Daniel dos Santos Araujo Faria
*/
package checkpoint1_ddd_breno_daniel;

import java.util.Scanner;

public class AnimeTeste {
	
	public static void main(String[] args) {
		
		Scanner texto = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);
		
		Anime a = new Anime();
		System.out.println("Digite o nome do anime: ");
		a.nome = texto.nextLine();
		System.out.println("Digite a classifica��o indicativa 10, 12, 14, 16, 18, "
				+ "para classifica��o livre digite 0 ");
		a.classificacaoIndicativa = numeros.nextInt();
		System.out.println("Digite o autor do anime: ");
		a.autor = texto.nextLine();
		System.out.println("Digite o genero do anime: ");
		a.genero = texto.nextLine();
		System.out.println("Digite a quantidade de epis�dios: ");
		a.qtdEpisodios = numeros.nextInt();
		System.out.println("Digite o numero de temporadas: ");
		a.numeroTemporadas = numeros.nextInt();	
		
		a.exibirDadosAnime();
		
		System.out.println(a.mensagem);
		
		Anime meuAnime = new Anime();
		meuAnime.nome = "One Piece";
		meuAnime.classificacaoIndicativa = 16;
		System.out.println("Digite a quantidade de epis�dios: ");
		meuAnime.qtdEpisodios = numeros.nextInt();
		System.out.println("Digite o numero de temporadas: ");
		meuAnime.numeroTemporadas = numeros.nextInt();	
		
		
		meuAnime.exibirDadosAnime();
		
		System.out.println(meuAnime.mensagem);
	}
}
