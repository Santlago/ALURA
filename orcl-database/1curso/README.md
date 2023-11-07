# Curso: SQL com Oracle Database: manipule e consulte dados

## Anotações

<h1>Grupos de comandos SQL:</h1>
DDL (comandos que mexem com a estrutura de um banco de dados):
 - CREATE: cria uma base de dados em uma tabela <br>
 - ALTER: altera as propriedades da estrutura dos componentes do banco (indice, tabela, banco, etc) <br>
 - TRUNCATE: apaga de forma definitiva os dados de uma tabela <br>
 - DROP: apaga realmente o componente da estrutura de dados <br><br>

DML (alteram o conteúdo dos objetos contidos no banco de dados):
 - INSERT: inclui dados dentro de uma tabela<br>
 - UPDATE: altera dados de uma tabela já existente<br>
 - DELETE: apaga os dados de uma tabela<br>
 - LOCK: gerencia a concorrência da atualização de dados na mesma tabela<br><br>

DCL (administrar o ambiente de um banco de dados):
 - COMMIT: salva o estado do banco de dados de forma definitiva no disco rígido<br>
 - ROLLBACK: retorna o estado de um banco de dados a partir de uma ponto salvo previamente<br>
 - SAVEPOINT: salva o ponto previamente<br><br>