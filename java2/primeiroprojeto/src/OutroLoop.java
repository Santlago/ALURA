import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double nota = 0;
        int div = 0;
        double somaAvaliacao = 0;

        while (nota != -1) {

            System.out.println("Digite a avaliação do filme ou -1 para sair: ");
            nota = leitura.nextDouble();

            if (nota != -1) {

                somaAvaliacao += nota;
                div += 1;
            }
        }

        System.out.println("A média de avaliações é: " + somaAvaliacao / div);
    }
}
