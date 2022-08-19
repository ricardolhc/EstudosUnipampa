# Lista de Exercícios: Matrizes

## Configuração
A ferramenta online utilizada para esta atividade é o [GDB online].

## Exercícios

### [Exercício 01](./exercicio_01.java)

Escreva um programa Java que declare uma matriz 5 x 5, preencha com 1 a diagonal principal e com 0 os demais elementos e, ao final, apresente a matriz obtida.

### [Exercício 02](./exercicio_02.java)

Escreva um programa Java que leia uma matriz 5 x 3, conte e escreva quantos valores maiores que 10 ela possui.

### [Exercício 03](./exercicio_03.java)

Escreva um programa Java que leia uma matriz 6 x 6 e escreva a soma dos elementos da diagonal principal.

### [Exercício 04](./exercicio_04.java)

Escreva um programa Java que leia uma matriz 5 x 5 e a transforme numa matriz triangular inferior, atribuindo zero a todos os elementos acima da diagonal principal. O programa deve apresentar a matriz.

### [Exercício 05](./exercicio_05.java)

Escreva um programa Java que leia uma matriz 4 x 3 e escreva a posição (linha e coluna) do menor valor.

### [Exercício 06](./exercicio_06.java)

Escreva um programa Java que leia uma matriz 2 x 4 e um valor X. O programa deverá fazer uma busca desse valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma mensagem de “não encontrado”.

### [Exercício 07](./exercicio_07.java)

Escreva um programa Java que leia uma matriz 5 x 2, onde cada
coluna corresponde a um lado de um triângulo retângulo. Declare um vetor que contenha a área dos respectivos triângulos e o escreva.

### [Exercício 08](./exercicio_08.java)

Escreva um programa Java que leia duas matrizes 4 x 4 e escreva os valores da primeira que ocorrem em qualquer posição da segunda.

### [Exercício 09](./exercicio_09.java)

Escreva um programa Java que leia uma matriz 2 x 3, gere e escreva a matriz transposta. A matriz transposta é gerada trocando linha por coluna. Veja o exemplo a seguir:

𝐶 = [1 2 3 4 5 6]

𝐶𝑡 = [1 4 2 5 3 6]

### [Exercício 10](./exercicio_10.java)

Escreva um programa Java que leia uma matriz 3 x 5, gere e escreva um vetor, onde cada elemento é a soma dos valores armazenados em uma linha da matriz. Faça o trecho que gera o vetor separado da entrada e saída.

### [Exercício 11](./exercicio_11.java)

Escreva um programa Java que possa armazenar as alturas de dez
atletas de cinco delegações que participarão dos jogos de verão. Imprimir a maior altura de cada delegação.

### [Exercício 12](./exercicio_12.java)

Escreva um programa Java que leia uma matriz 12 x 4 com os valores das vendas de uma loja, em que cada linha represente um mês do ano, e cada coluna, uma semana do mês. Calcule e imprima:

* Total vendido em cada mês do ano;
* Total vendido em cada semana durante todo o ano;
* Total vendido no ano.

### [Exercício 13](./exercicio_13.java)

A empresa Evite Desperdício tem registrados numa tabela os
consumos de energia elétrica dos anos 2000-2009. Cada linha representa um ano e cada coluna representa um mês. Considerando esses dados, fazer um programa Java que imprima:

* O consumo médio em cada um dos meses destes dez anos;
* O mês/ano em que a empresa gastou mais energia nestes dez anos.

### [Exercício 14](./exercicio_14.java)

Uma certa fábrica produziu dois tipos de motores M1 e M2 nos
meses de janeiro a fevereiro. O número de motores foi registrado na Tabela 1. O setor de controle de vendas tem uma tabela de custo e do lucro (em mil reais) obtidos com cada motor conforme Tabela 2.


|  Tabela 1 |  M1 |  M2 |
|-----------|-----|-----|
| Janeiro   | 30  | 20  |
| Fevereiro | 5   | 10  |
| ...       | ... | ... |
| Dezembro  | 18  | 25  |

| Tabela 2 | Custo | Lucro |
|----------|-------|-------|
| M1       | 10    | 3     |
| M2       | 15    | 2     |

*Os números são exemplos*.

Faça um programa Java que leia a produção mensal, custo e lucro dos motores M1 e
M2, calcule e imprima o custo e o lucro em cada um dos meses e o lucro anual.

### [Exercício 15](./exercicio_15.java)

As tabelas dadas a seguir contêm três produtos que estão
armazenados em quatro armazéns de uma companhia. É fornecido também o custo de cada um dos produtos.

|           | Produto 1 | Produto 2 | Produto 3 |
|-----------|-----------|-----------|-----------|
| Armazém 1 | 1200      | 3700      | 3737      |
| Armazém 2 | 1400      | 4210      | 4224      |
| Armazém 3 | 2000      | 2240      | 2444      |
| Armazém 4 | 1700      | 1680      | 3555      |

|           |  Custo |
|-----------|:------:|
| Produto 1 | 260,00 |
| Produto 2 | 420,00 |
| Produto 3 | 330,00 |

*Os números são exemplos*.

Faça um programa em Java que:

* Leia o custo de cada produto e o estoque de cada produto em cada armazém;
* Determine e imprima quantos itens estão armazenados em cada armazém;
* Determine e imprima qual o armazém que possui a maior quantidade de produto
2;
* Determine e imprima o custo total de cada produto em cada armazém;
* Determine e imprima o custo total de cada produto em todos os armazéns;
* Determine e imprima o custo total de cada armazém.

[GDB online]: https://www.onlinegdb.com
