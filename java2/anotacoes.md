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
