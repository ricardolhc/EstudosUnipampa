# Lista de Exercícios: Classes, Objetos, Atributos e Métodos 

## Resumo
Exercícios que contêm os passos iniciais do tratamento de exceções

## Configuração
A ferramenta utilizada para esta atividade é o [Visual Studio Code](https://code.visualstudio.com/download).

## Exercícios

### [Exercício 01](./exercicio_01)

1. Identifique as partes problemáticas do código abaixo https://onlinegdb.com/0aDR1XLrj e reescreva-o utilizando tratamento de exceções. Sua classe deve tratar as seguintes exceções: ○ ArithmeticException quando ocorrer uma divisão por zero. ○ InputMismatchException quando o valor informado não é numérico. A cada ocorrência de exceção, o usuário deve ser alertado sobre qual é o problema e deve ser permitida uma nova entrada de valores.

<pre>
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        double r;
        System.out.println("Vamos dividir?");
        System.out.print("Informe o primeiro número: ");
        a = entrada.nextInt();
        System.out.print("Informe o segundo número: ");
        b = entrada.nextInt();
        r = (a/b);
        System.out.print("Resultado da divisão: " + r);
    }
}
</pre>

### [Exercício 02](./exercicio_02)

O código abaixo lança uma exceção (propositalmente) e interrompe sua execução. Utilizando o tratamento de exceções, corrija a classe com o objetivo de não parar sua execução. O código está disponível: https://onlinegdb.com/xZ94rezKU OBS: A Exception lançada é ArrayIndexOutOfBoundsException

<pre>
public class Main
{
    public static void main(String[] args) {
        System.out.println("Inicio da main");
        metodo1();
        System.out.println("fim da main");
    }
    public static void metodo1() {
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("fim do método 1");
    }
    public static void metodo2() {
        System.out.println("Inicio do método 2");
        int [] array = new int[10];
        for(int i=0; i<=15; i++){
        array[i] = i;
        System.out.println(i);
        }
        System.out.println("fim do método 2");
    }
}
</pre>

### [Exercício 03](./exercicio_03)

Modifique o projeto Banco: https://onlinegdb.com/aNrzWSIvQ

* Modifique o método deposita da classe Conta para lançar uma exceção do tipo IllegalArgumentException (que já faz parte da biblioteca do java) com a mensagem “Valor negativo” sempre que o valorpassado como argumento for negativo.
* Crie a exceção SaldoInsuficienteException que estende da classe Exception, conforme apresentado nos slides.
* Modifique o método saca da classe Conta para que ao invés de retornar um boolean, esse método lance uma exceção do tipo IllegalArgumentException com a mensagem “Valor negativo” sempre que o valor passado como argumento for negativo e lance uma
exceção do tipo SaldoInsuficienteException com a mensagem “Saldo insuficiente” quando o saldo da conta for menor do que o valor informado.
* Modifique a classe Banco para contemplar o tratamento de exceções.