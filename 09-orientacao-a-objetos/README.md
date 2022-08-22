# Lista de Exercícios: Matrizes

## Configuração
As ferramentas utilizadas para a realização do trabalho são o [Visual Studio Code](https://code.visualstudio.com/download) e [GDB Online](https://www.onlinegdb.com).

## Exercícios

### [Exercício 01](./exercicio_01)

Escreva uma classe para representar um quadrado. Forneça os
métodos para calcular a área e o perímetro. Que atributos devem ser representados?

### [Exercício 02](./exercicio_02)

Escreva uma classe para representar um relógio. Que atributos devem ser representados? Quais métodos devem ser fornecidos?


### [Exercício 03](./exercicio_03)

Crie uma classe Televisor. Essa classe deve possuir três atributos: canal, volume e ligado. O atributo canal inicia em 1 e vai até 16. O atributo volume inicia em 0 e vai até 10 e o atributo ligado inicia em false, ou seja, televisor desligado. A classe Televisor deve possuir os seguintes métodos:

<b>boolean aumentarVolume()</b> // Aumenta em 1 o volume
<br>
<b>boolean reduzirVolume()</b> // Diminui em 1 o volume
<br>
<b>boolean subirCanal()</b> // Aumenta em 1 o canal
<br>
<b>boolean descerCanal()</b> // Diminui em 1 o canal
<br>
<b>boolean ligarTelevisor()</b> // Liga a televisão
<br>
<b>boolean desligarTelevisor()</b> // Desliga a televisão
<br>
<b>String mostraStatus()</b> // Retorna uma String contendo o canal, o volume e se o televisor está ligado.

O retorno do valor booleano True indica que a operação pode ser realizada. Por exemplo, se o volume estiver no 10 e o método aumentarVolume() for chamado novamente, o retorno deve ser False e uma mensagem de aviso deve ser apresentada. 

Quando desligado, o canal e o volume devem retornar a seus valores iniciais e não deve realizar nenhuma operação, até que o método ligarTelevisor() seja chamado

### [Exercício 04](./exercicio_04)

Crie uma classe Produto. Essa classe deve possuir três atributos: nome, quantidade e preço unitário. Não esqueço de fornecer os métodos para consultar e modificar os valores dos atributos.

Usando a classe Produto, desenvolva um programa em Linguagem
Java que cria um estoque com diferentes tipos de produtos. Ao usuário deve ser permitido informar quantos produtos deseja cadastrar e, então, indicar, para cada produto, seu nome, quantidade e preço. Ao final, o programa deve exibir todos os produtos em estoque com suas informações correspondentes.

### [Exercício 05](./exercicio_05)

Crie uma classe VetorDeInteiros. Essa classe deve modelar o
comportamento de um vetor de inteiros. Seu construtor deve receber o tamanho máximo do vetor. A classe deve possuir os seguintes métodos:

<b>boolean add(int valor)</b> // Adiciona o valor ao vetor; retorna false caso o vetor esteja cheio.
<br>
<b>boolean set(int indice, int valor)</b> // Seta o valor na posição do vetor informada pelo índice. Retorna false caso o índice não esteja entre 0 e o tamanho máximo do vetor -1.
<br>
<b>int get(int indice)</b> // Retorna o valor armazenado na posição informada pelo índice. Retorna -1 caso o índice não esteja entre 0 e o tamanho máximo do vetor -1.
<br>
<b>int size()</b> // Retorna a quantidade de posições que estão ocupadas no vetor.
<br>
<b>boolean remove(int indice)</b> // Remove o valor armazenado na posição informada pelo índice. Retorna false caso o índice não esteja entre 0 e o tamanho máximo do vetor -1.

Usando a classe VetorDeInteiros, desenvolva um programa em
Linguagem Java que cria um vetor capaz de armazenar até 20 números inteiros e apresenta um menu para que o usuário escolha quais ações realizar até que a opção de sair seja escolhida