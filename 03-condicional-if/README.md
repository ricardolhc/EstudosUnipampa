# Lista de Exercícios: Estruturas Condicionais IF

## Configuração
A ferramenta online utilizada para esta atividade é o [GDB online].

## Exercícios

### [Exercício 1](./exercicio_01.java)
Faça um programa que receba dois números inteiros (digitados pelo usuário) e mostre o maior e o menor número digitado.

Por exemplo:

N1 = 4
<br>
N2 = 6
<br>
Saída: Maior = 6 Menor = 4

### [Exercício 2](./exercicio_02.java)
Faça um programa que leia três notas, calcule a média entre elas e verifique a situação do aluno na tabela abaixo. Ao final o programa deve apresentar ao usuário a seguinte mensagem: media = x : situação.

|  Média |  Situação |
|:------:|:---------:|
| >= 6.0 |  Aprovado |
|  < 6.0 | Reprovado |

Por exemplo:

N1 = 7.3
<br>
N2 = 4.9
<br>
N3 = 8
<br>
Saída: Media = 6.93 : Aprovado

### [Exercício 3](./exercicio_03.java)
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:

|  Idade  | Categoria |
|:-------:|:---------:|
| 10 - 14 |  Infantil |
| 15 - 17 |  Juvenil  |
| 18 - 25 |   Adulto  |
|  Outros |  Inválida |

Por exemplo:

Idade = 17
<br>
Saída: Categoria Juvenil

### [Exercício 4](./exercicio_04.java)
Faça um programa que receba a quantidade de pessoas que assistiram a uma partida de futebol e mostre as mensagens de acordo com a tabela:

|       Público      |      Situação     |
|:------------------:|:-----------------:|
|   Menor que 5000   |   Público Fraco   |
| Entre 5000 e 20000 |    Público Bom    |
|   Acima de 20000   | Público Excelente |

Por exemplo:

Publico = 8598
<br>
Saída: Publico Bom

### [Exercício 5](./exercicio_05.java)
Faça um programa que leia a idade de uma pessoa e informe se ela pode ou não votar de acordo com a tabela abaixo.

|            Idade            |     Situação     |
|:---------------------------:|:----------------:|
| Abaixo de 16                | Não pode votar   |
| Entre 16 e 18 e acima de 70 | Voto facultativo |
| Entre 18 e 70               | Voto obrigatório |

Por exemplo:

Idade = 80
<br>
Saída: Voto facultativo

Idade = 15
<br>
Saída: Não pode votar

### [Exercício 6](./exercicio_06.java)
Faça um programa que leia o peso (kg) e a altura (m) de uma pessoa. A partir dessas informações, calcule o índice de massa corporal (IMC = peso / altura²)), verifique a situação de acordo com a tabela abaixo e escreva a frase: IMC = x : situação.

|        IMC        |          Situação         |
|:-----------------:|:-------------------------:|
| Abaixo de 18.5    | Abaixo do peso ideal      |
| Entre 18.5 e 24.9 | Peso ideal                |
| Entre 25.0 e 29.9 | Acima do peso (sobrepeso) |
| 30.0 e acima      | Obesidade                 |

Por exemplo:

Peso = 80
<br>
Altura = 1.80
<br>
Saída: IMC = 24.69 : Peso ideal


### [Exercício 7](./exercicio_07.java)
Faça um programa que leia a hora (entre 0 e 23) e os minutos (0 e 59) e informe o total de segundos. Se a hora informada for menor que 0 ou maior que 23, então informe a mensagem “Hora incorreta”. Se os minutos informados for menor que 0 ou maior que 59, então informe a mensagem “Minutos incorretos”. Se a hora e os minutos estiverem incorretos então informe as duas mensagens.

Por exemplo:

Hora = 5
<br>
Minutos = 30
<br>
Saída: 19800 segundos

Hora = 24
<br>
Minutos = 61
<br>
Saída: Hora incorreta
<br>
Minutos incorretos

[GDB online]: https://www.onlinegdb.com
