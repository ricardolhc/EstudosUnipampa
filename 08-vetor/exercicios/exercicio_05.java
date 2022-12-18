import java.util.Scanner;

public class Exercicio_05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
		    System.out.print("Digite o " + i + " numero: ");
		    vetor[i] = input.nextInt();
		}
		
		int menorNumero = vetor[0];
		int maiorNumero = vetor[0];
		
		for(int i = 0; i < vetor.length; i++) {
		    if(menorNumero > vetor[i]) {
		        menorNumero = vetor[i];
		    }
		    if(maiorNumero < vetor[i]) {
		        maiorNumero = vetor[i];
		    }
		}
		
		System.out.println("O maior numero é: " + maiorNumero);
		System.out.print("O menor numero é: " + menorNumero);

		input.close();
		
	}
}