import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
		    System.out.print("Digite o " + i + " numero: ");
		    vetor[i] = entrada.nextInt();
		}
		
		int menorNumero = vetor[0];
		int maiorNumero = vetor[0];
		
		for(int i = 0; i < 10; i++) {
		    if(menorNumero > vetor[i]) {
		        menorNumero = vetor[i];
		    }
		    if(maiorNumero < vetor[i]) {
		        maiorNumero = vetor[i];
		    }
		}
		
		System.out.println("O maior numero é: " + maiorNumero);
		System.out.print("O menor numero é: " + menorNumero);
		
	}
}