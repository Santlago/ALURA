# Next.js: Explorando o framework

<p>Vercel - empresa por tras do next</p>

<p>Curso recomendado: Performance Web I: otimizando o front-end</p>


Métricas para ver se o site está bom:<br>
![metricas](image.png)

<p>
React por padrao é client side render e isso faz o site demorar para carregar na primeira vez, por isso devemos mudá-lo para serverr side render
</p>

<p>
Documentação Next.js: https://nextjs.org/
</p>

Diferença NPM e Yarn:<br>
![diferenca](image-1.png)

<p>
getStaticProps = roda apenas no build (dê preferencia para esse pois ele roda mais rapido) EM MODO DEV SEMPRE RODA A CADA ACESSO
getServerSideProps = roda a cada acesso que voce recebe (apenas use se for realmente necessario) EM MODO DEV SEMPRE RODA A CADA ACESSO
</p>

<p>
SSG - Static Side Generating
SSR - Server Side Rendering
ISG - Incremental Static Generation (praticamente a mistura dos 2)
</p>