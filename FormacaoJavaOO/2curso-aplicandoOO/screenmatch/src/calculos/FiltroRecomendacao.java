package calculos;

public class FiltroRecomendacao {
    
    //atributos
    private String Recomendacao;

    //métodos
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos no momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito vem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
