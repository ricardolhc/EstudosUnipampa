import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
		    System.out.print("Digite o " + i + " numero: ");
		    vetor[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
		    soma += vetor[i];
		}
		
		System.out.print("A soma total é: " + soma);

		input.close();
		
	}
}