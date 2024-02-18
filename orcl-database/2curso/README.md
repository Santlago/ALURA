# Oracle Database: projeções, seleções, joins e views

<p>
    Para criar um alias para a tabela basta colocar um espaço e o nome da tabela:
    <code>SELECT CPF AS IDENTIFICADOR, NOME AS "NOME DE CLUENTE", BAIRRO, CIDADE FROM tabela_de_clientes TDC;</code>
</p>

<p>
    <ul>
        <li>Aspas simples são para string: <code>'Paulo'</code></li>
        <li>Aspas duplas são para nome de alias compostos: <code>"NUMERO DE COMPRAS"</code></li>
    </ul>
</p>

![OPERADORES](image.png)
![alt text](image-1.png)<br>
### Select Distinct apenas mostra os valores que sao diferentes
![DISTINCT](image-2.png)
### Limitando a saíada da consulta
![LIMITANDO](image-3.png)
### Ordenando a saida
![ORDENAR](image-4.png)
### Agrupando linhas
![AGRUPAR](image-5.png)
![AGRUPAR2](image-6.png)
![COUNT](image-7.png)