# Curso: SQL com Oracle Database: manipule e consulte dados

## Anotações

<h1>Grupos de comandos SQL:</h1>
DDL (é o conjunto de comandos para criação das entidades do banco de dados relacional):
 - CREATE: cria uma base de dados em uma tabela <br>
 - ALTER: altera as propriedades da estrutura dos componentes do banco (indice, tabela, banco, etc) <br>
 - TRUNCATE: apaga de forma definitiva os dados de uma tabela <br>
 - DROP: apaga realmente o componente da estrutura de dados <br><br>

DML ( é o conjunto de comandos para manipular os dados de um banco de dados relacional):
 - INSERT: inclui dados dentro de uma tabela<br>
 - UPDATE: altera dados de uma tabela já existente<br>
 - DELETE: apaga os dados de uma tabela<br>
 - LOCK: gerencia a concorrência da atualização de dados na mesma tabela<br><br>

DCL ( é o conjunto de comandos para controlar o banco de dados relacional):
 - COMMIT: salva o estado do banco de dados de forma definitiva no disco rígido<br>
 - ROLLBACK: retorna o estado de um banco de dados a partir de uma ponto salvo previamente<br>
 - SAVEPOINT: salva o ponto previamente<br><br>

<h1>História da Oracle</h1>

![História da Oracle](image-1.png)

<h1>Entidade de um banco de dados</h1>

![Tabela](image.png)

<h1>Tipos de campos</h1>
<p>Query é consulta, ie. "fazer a query da tabela de clientes de tal lugar"</p>
<p>alias é um apelido, ie. SELECT PRODUTO AS "CODIGO DO PRODUTO"...</p>

![TIPOS TRATADOS](image-13.png)<br/>
![CHAR](image-2.png)<br/>
![VARCHAR e VARCHAR2](image-3.png)<br/>
![NCHAR, NVARCHAR E NVARCHAR2](image-4.png)<br/>
![CLOB E NLOB](image-5.png)<br/>
![NUMBER](image-6.png)<br/>
![NUMBER EXEMPLOS](image-7.png)<br/>
![INTEGERS E DECIMALS](image-8.png)<br/>
![DATE](image-9.png)<br/>
![DATE: CURIOSIDADE](image-10.png)<br/>
![TIMESTAMPS](image-11.png)<br/>
![BINARIOS](image-12.png)<br/>
![MODELO RELACIONAL](image-14.png)