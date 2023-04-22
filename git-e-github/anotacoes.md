<h1>md = markdown: é uma linguagem de marcação de texto, assim como html, só que mais simples.</h1>
readme.md utilizado geralmente para mostrar informações importantes osbre o projeto, por exemplo: requisitos para roda, detalhes de configuração etc

3 crases: usado para deixar em forma de codigo

a tecla "." irá abrir uma ide vscode based para editar os arquivos
para dar commit no codigo digitado basta ir em Source Control

o git é do mesmo criador do linux

```git clone "url"``` (clona o repositório do link)<br>
```git log --oneline``` (mostra todos os últimos commits)<br>
```git pull "url"``` (atualiza o git local com as informações do git origem)<br>
```git commit "nome do arquivo" -m "mensagem do commit"``` (faz o commit e deixa uma mensagem)<br>
```git commit "." -m "mensagem do commit"``` (faz o commit de todos os arquivos que foram modificados e deixa uma mensagem)<br>
```git push origin "divisao desejada"``` (salva as atualizacoes na divisao)<br>


restore: volta para um commit anterior pela sua hash (cada commit tem sua hash unica<br>

```git restore --source "hash do commit" "arquivo q vc quer modificar"``` (restaura o arquivo selecionado no commit selecionado)<br>
```git restore --source "hash do commit" "."``` (restaura todos os arquivos no commit selecionado)<br>
```git log``` (é usado para mostrar o historico de alteracoes)<br>
```git log --online``` (visualizar todos os commits, um em cada linha)<br>
```git log -p``` (mostra as alterações do commit)<br>
```git log --author="nome do usuario"``` (pesquisa as informacoes do autor daquele commit)<br>
```git log --since=1.month.ago --until=1.day.ago``` (pesquisa informacoes por data)<br>


```git add "nome do arquivo ou ."``` (adiciona novo arquivo)<br>
depois basta dar committ e push<br>

branches: ramificacoes da aplicacao<br>
```git branch "nome da branch``` (adiciona nova branch)<br>
```git checkout -b "nome da branch``` (adiciona nova branch e entra automaticametne nela)<br>
```git switch "nome da branch"``` (entra em outra branch)<br>

```git branch``` (mostra as branches disponiveis e a que esta selecionada)<br>
```git merge "nome da branch"``` (faz o merge da branch em questao com o main)<br>
após isso basta dar o push<br>
