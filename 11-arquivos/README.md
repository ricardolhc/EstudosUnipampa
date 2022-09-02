# Lista de Exercícios: Arquivos

## Resumo
Exercícios que contêm a manipulação de arquivos, podendo ler e/ou gravar arquivos de texto ou binários.

## Configuração
A ferramenta utilizada para esta atividade é o [Visual Studio Code](https://code.visualstudio.com/download).

## Exercícios

### [Exercício 01](./exercicio_01)

Faça um programa que informe o somatório de todos os números contidos em um arquivo, cujo nome do arquivo é informado como parâmetro de entrada do programa. Exemplo do conteúdo do arquivo:

1 5 9 20 14 52 45
<br>
78 7 6 70 64 78 96 78
<br>
2 8 12 16 42 27 66 37

Saída do programa: 
<br>
Resultado do somatório = 833

### [Exercício 02](./exercicio_02)

Faça um programa que solicita ao usuário o nome e o telefone de um número indefinido de pessoas e armazena-os em um arquivo texto no seguinte formato:

Nome: Maria Antonia Telefone: 11223344
<br>
Nome: Joao Manuel Telefone: 22223333
<br>
Nome: Roberto Carlos Telefone: 99887766

### [Exercício 03](./exercicio_03)

As classes Pessoa e Carro são definidas como segue:

class Pessoa implements Serializable {
<br>
private String nome;
<br>
private Date dataNascimento;
<br>
private String endereco;
<br>
//declaração dos métodos
<br>
}

class Carro implements Serializable {
<br>
private Pessoa proprietario;
<br>
private String placa;
<br>
private int ano;
<br>
//declaração dos métodos
<br>
}

Modifique essas classes para permitir que seus objetos sejam gravados e/ou lidos de <strong>arquivos binários</strong>.

### [Exercício 04](./exercicio_04)

Uma loja de equipamentos de construção precisa manter um inventário que pode informar as diferentes ferramentas em estoque, quantas unidades de cada item estão à disposição e o preço de cada um. Veja um exemplo na tabela abaixo. Escreva um programa Java, que guarde essas informações em arquivo binário. Utilize serialização de objetos para isso.

| Número do registro | Nome da ferramenta | Quantidade | Preço |
|:------------------:|--------------------|-----------:|------:|
|          3         | Lixadeira          |         18 | 35.99 |
|         19         | Martelo            |        128 | 10.00 |
|         26         | Serra tico-tico    |         16 | 14.25 |
|         39         | Cortador de grama  |         10 | 79.50 |
|         56         | Serra              |          8 | 89.99 |