import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
		    System.out.print("Digite o " + (i + 1) + " numero: ");
		    vetor[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
		    for(int j = 0; j < vetor.length; j++) {
		        if(i != j && j > i && vetor[i] > vetor[j]) {
		            int aux = vetor[i];
		            vetor[i] = vetor[j];
		            vetor[j] = aux;
		        }
		    }
		}
		
		for(int i = 0; i < vetor.length; i++) {
		    System.out.print(vetor[i] + " ");
		}

		entrada.close();
		
	}
}