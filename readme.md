[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/L04k_9nU)

## Engenharia de Telecomunicações - Programação Orientada a Objetos 
### Bernardo Souza Muniz - Laboratório 1

Esse repositório tem o objeitvo de mostrar a resolução dos exercícios proposto no laboratório 1 da disciplina de Programação Orientada a Objetos.

### Como usar o repositório:
Para clonar o repositório para a sua máquina local utilizando Git, basta executar o seguinte comando no seu terminal:

`https://github.com/sergio-prolo-class/laboratorio-1-classes-e-objetos-BernardoMuniz39`

### Sobre os exercícios
O repositório contem a elaboração de classes em Java. Todas as demonstrações de funcinalidades estão instanciadas dentro do arquivo **App.java** separados por uma linha demarcadora.

Você pode verificar a elaboração das classes e suas funcionalidades acessando os arquivos individuais dentro da mesma pasta aonde se encontra **App.java**.

Fique a vontade para testar as funcionalidades presentes nas classes.

### Classe 1 - Lâmpada
A classe lâmpada possui as funcionalidades de ligar, desligar e ver o estado em que a lâmpada se encontra.

Seu único atributo é uma variável booleana que identificada seu estado (ligada ou desligada)

Abaixo está a descrição de cada método do classe lâmpada:
- ligar(): Liga a lâmpada;
- desligar(): Desliga a lâmpada;
- verEstado(): Verifica se a lâmpada está ligada ou desligada.

Dentro do arquivo **App.java** foram criados duas lâmpadas e uma foi ligada e desligada.


### Classe 2 - Pessoa
A classe pessoa pode nomear uma pessoa, verificar o nome de uma pessoa, atribuir uma idade, verificar a idade de uma pessoa e dar feliz aniversário, incrementando sua idade.

Abaixo está a descrição de cada método do classe pessoa:
- setNome(): Nomeia uma pessoa;
- getNome(): Verifica o nome de uma pessoa;
- setIdade(): Atribui uma idade de uma pessoa;
- getIdade(): Verifica a idade de uma pessoa;
- felizAniversario(): Incrementa  a idade de uma pessoa e deseja feliz aniversário.

Dentro do arquivo **App.java** foram criados duas pessoas, comemorado o aniversário, imprimido a idade de cada uma e verificado a atribuição de nome e idade inválidos.

Uma pessoa possui os atributos de nome e idade.

### Classe 3 - Retângulo
A classe retangulo atribui uma largura e uma altura, cálcula a área e o perímetro.

Abaixo está a descrição de cada método do classe retângulo:
- setLargura(): Atribui uma largura;
- setAltura(): Atribui um altura;
- getArea(): Calcula a área;
- getPerimetro(): Calcula o perímetro.

Dentro do arquivo **App.java** foi criado um retângulo, atribuido altura e largura e verificado sua área e perímetro. Além disso, foi criado uma lista com 10 retângulos e atribuidos valores aleatórios de largura e altura e imprimido a maior razão área/perímetro.

Um retângulo possui atributos de largura e altura.

### Classe 4 - Relógio
A classe relógio atribui uma hora, minuto e segundo para um relógio, verifica o horário atual e avança hora, minuto segundo.

Abaixo está a descrição de cada método do classe relógio:
- ajustaHora(): Atribui uma hora, minuto e segundo para um relógio;
- getHora(): Verifica a hora atual;
- avancaHora(): Avança as horas;
- avancaMinuto(): Avança os minutos;
- avancaSegundo(): Avança os segundos;
- horaFormatada(): Mostra as horas formatadas no padrão estado-unidense.

Dentro do arquivo **App.java** foi criado um relógio, atribuido um horário, avançado os segundos, minutos e mostrado o horário formatado.

Um relógio possui os atributos de hora, minuto e segundo.

### Classe 5 - Produto
A classe produto cria um novo produto, podendo atribuir um preço, um nome, um desconto e fazer um anúncio promocional.

Abaixo está a descrição de cada método do classe produto:
- setNome(): Nomeia um produto;
- getNome(): Retorna um nome de um produto;
- setPreco(): Atribui um preço a um produto;
- setDesconto(): Atribui um desconto a um produto;
- getDesconto(): Retorna o desconto de um produto;
- anuncio(): Faz o anúncio de um produto em promoção com o valor de desconto atribuído.

Dentro do arquivo **App.java** foi criado um produto, atribuído preço, desconto e feito o anúncio do produto;

Um produto possui os atributos de nome, preço e desconto.

### Classe 6 - Livro
A classe livro permite a criação de um novo livro, podendo atribuir um autor, um título, os nomes de capítulos, genêro literário e atribuir as páginas de cada capítulo.

Abaixo está a descrição de cada método da classe livro:
- setTitulo(): Permite a atribuição de um título a um livro; 
- getTitulo(): Permite verificar qual o título do livro;
- setAutor(): Permite atribuir um autor a um livro;
- getAutor(): Permite verificar qual o autor do livro;
- setGeneros(): Permite atribuir até 2 gêneros a um livro;
- getGeneros(): Permite verificar quais são os gêneros do livro;
- setTotPaginas(): Permite atribuir o total de páginas do livro;
- getTotPaginas(): Permite verificar qual é o total de páginas do livro;
- lerpaginas(): Permite avançar a leitura das páginas de um livro;
- getPagLidas(): Permite verificar quantas páginas até o momento de um livro;
- setCapitulos(): Permite inicializar os capítulos de um livro;
- setMudancaDeCapitulos(): Permite atribuir as páginas aonde os capítulos mudam;
- getCapitulo(): Permite verificar qual é o capítulo de leitura atual através da quantidade de páginas lidas.

Dentro do arquivo **App.java** foi criado um livro, atribuido título, autor, gênero literário, quantidade de páginas, capítulos e quantidade de páginas de cada capítulo. Além disso foi lido páginas e verificado qual o capítulo atual de acordo com a quantidade lida.

Um livro possui os atributos de titulo, autor, gênero, capítulos, quantidade total de páginas, páginas lidas e quantidade de páginas de cada capítulo.