import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int pos;
		
		for(int i = 0; i < vetor.length; i++) {
		    System.out.print("Digite o " + i + " numero: ");
		    vetor[i] = entrada.nextInt();
		}
		
		System.out.print("Digite a posicao do vetor (0-9): ");
		pos = entrada.nextInt();
		
		System.out.print("O valor da posicao " + pos + " é: " + vetor[pos]);

		entrada.close();
		
	}
}
