import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int pos;
		
		for(int i = 0; i < vetor.length; i++) {
		    System.out.print("Digite o " + i + " numero: ");
		    vetor[i] = input.nextInt();
		}
		
		System.out.print("Digite a posicao do vetor (0-9): ");
		pos = input.nextInt();
		
		System.out.print("O valor da posicao " + pos + " é: " + vetor[pos]);

		input.close();
		
	}
}
