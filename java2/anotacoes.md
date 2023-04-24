<h1>Aqui farei algumas anotações sobre o cruso</h1>

Comparação de Strings
```
.equals()
```
<br>

Comparação de Strings independente de letra maiuscula/minuscula
```
equalsIgnoreCase()
```
<br>

Sintaxe do TextBlock
```
String mensagem = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
```
<br>

Método que permite formatar um texto utilizando diversos placeholders
```
format()
```
<br>

Por exemplo: <br>
```%s``` indica que uma String será inserida no placeholder <br>
```%d``` indica que um valor inteiro será inserido no placeholder <br>
```%f``` indica que um valor decimal será inserido no placeholder <br>

Na prática ficaria assim:
```
String nome = "Maria";
int idade = 30;
double valor = 55.9999;
System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
```
<br>

Também temos o ```.formatted()``` que é utilizado para informar as variáveis que deverão ser utilizadas no lugar dos placeholders. Veja o exemplo:
```
String nome = “João”;
int aulas = 4;

String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

System.out.println(mensagem);
```
<br>

Switch Case
```
switch (expressão) {
   case valor1:
      // código a ser executado se a expressão for igual a valor1
      break;
   case valor2:
      // código a ser executado se a expressão for igual a valor2
      break;
   case valor3:
      // código a ser executado se a expressão for igual a valor3
      break;
   ...
   default:
      // código a ser executado se a expressão não for igual a nenhum valor
      break;
}
```
<br>

Scanner é utilizado para ler dados no java. Exemplo
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de lacamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);
    }
}
```
<br>

Loops for. Exemplo
```
public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao / 3);
    }
```
<br>

Loops While. Exemplo
```
Scanner leitura = new Scanner(System.in);

        double nota = 0;
        double somaAvaliacao = 0;
        int div = 0;

        while (nota != -1) {

            System.out.println("Digite a avaliação do filme ou -1 para sair: ");
            nota = leitura.nextDouble();

            if (nota != -1) {

                somaAvaliacao += nota;
                div ++;
            }
        }

        System.out.println("A média de avaliações é: " + somaAvaliacao / div);
```
