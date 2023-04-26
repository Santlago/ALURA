/*Nome: Breno Lemes Santiago - RM:552270
 Nome: Daniel dos Santos Araujo Faria
*/

package checkpoint1_ddd_breno_daniel;

public class Anime {
	String nome;
	int classificacaoIndicativa;
	String genero;
	String autor;
	int qtdEpisodios;
	int numeroTemporadas;
	String mensagem;
	
	public double mediaEpisodiosPorTemporada(){
		return qtdEpisodios / numeroTemporadas;
	}
	
	public String exibirClassificacao(){
		if (classificacaoIndicativa == 0) {
			return "LIVRE PARA TODOS OS P�BLICOS";
		} else if (classificacaoIndicativa == 10) {
			return "N�O RECOMENDADO PARA MENORES DE 10 ANOS";
		} else if (classificacaoIndicativa == 12) {
			return "N�O RECOMENDADO PARA MENORES DE 12 ANOS";
		} else if (classificacaoIndicativa == 14) {
			return "N�O RECOMENDADO PARA MENORES DE 14 ANOS";
		} else if (classificacaoIndicativa == 16) {
			return "N�O RECOMENDADO PARA MENORES DE 16 ANOS";
		} else if (classificacaoIndicativa == 18) {
			return "N�O RECOMENDADO PARA MENORES DE 18 ANOS";
		}
		return "NADA FOI DIGITADO";
	}
	
	public void exibirDadosAnime() {
		mensagem = "Nome do anime: " + this.nome + "\n" + "De acordo com o "
		+ "minist�rio da justi�a esse anime " + this.exibirClassificacao() 
		+ "\n" + "A m�dia de epis�dios por temporada �: " + this.mediaEpisodiosPorTemporada();
	}
}
