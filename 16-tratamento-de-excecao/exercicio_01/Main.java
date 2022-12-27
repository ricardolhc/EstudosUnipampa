import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        double r;
        Exception er;
        do {
            try {
                er = new Exception();
                System.out.println("Vamos dividir?");
                System.out.print("Informe o primeiro número: ");
                a = entrada.nextInt();
                System.out.print("Informe o segundo número: ");
                b = entrada.nextInt();
                r = a / b;
                System.out.print("Resultado da divisão: " + r);
            } catch (ArithmeticException e) {
                System.out.println("Não é possível dividir por 0");
                er = e;
            } catch (InputMismatchException e) {
                System.out.println("Informe apenas números inteiros");
                er = e;
                entrada.nextLine();
            }
        } while (er instanceof ArithmeticException || er instanceof InputMismatchException);
        entrada.close();
    }
}