import models.Filme;

public class Principal {
    
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
