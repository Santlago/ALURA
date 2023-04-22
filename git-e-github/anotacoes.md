md = markdown: é uma linguagem de marcação de texto, assim como html, só que mais simples. 
readme.md utilizado geralmente para mostrar informações importantes osbre o projeto, por exemplo: requisitos para roda, detalhes de configuração etc

3 crases: usado para deixar em forma de codigo

a tecla "." irá abrir uma ide vscode based para editar os arquivos
para dar commit no codigo digitado basta ir em Source Control

o git é do mesmo criador do linux

```git clone "url"``` (clona o repositório do link)
```git log --oneline``` (mostra todos os últimos commits)
```git pull "url"``` (atualiza o git local com as informações do git origem)
```git commit "nome do arquivo" -m "mensagem do commit"``` (faz o commit e deixa uma mensagem)
```git commit "." -m "mensagem do commit"``` (faz o commit de todos os arquivos que foram modificados e deixa uma mensagem)
```git push origin "divisao desejada"``` (salva as atualizacoes na divisao)

restore: volta para um commit anterior pela sua hash (cada commit tem sua hash unica
git restore --source "hash do commit" "arquivo q vc quer modificar" (restaura o arquivo selecionado no commit selecionado)
git restore --source "hash do commit" "." (restaura todos os arquivos no commit selecionado)

git log (é usado para mostrar o historico de alteracoes)
git log --online (visualizar todos os commits, um em cada linha)
git log -p (mostra as alterações do commit)
git log --author="nome do usuario" (pesquisa as informacoes do autor daquele commit)
git log --since=1.month.ago --until=1.day.ago (pesquisa informacoes por data)

git add "nome do arquivo ou ." (adiciona novo arquivo)
depois basta dar commir e push

branches: ramificacoes da aplicacao
git checkout 
