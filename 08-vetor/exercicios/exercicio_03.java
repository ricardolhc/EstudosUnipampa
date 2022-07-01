import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int soma = 0;
		
		for(int i = 0; i < 10; i++) {
		    System.out.print("Digite o " + i + " numero: ");
		    vetor[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
		    soma += vetor[i];
		}
		
		System.out.print("A soma total é: " + soma);
		
	}
}