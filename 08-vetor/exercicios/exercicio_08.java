import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int vetorC[] = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
		    System.out.print("Digite o " + i + " numero do vetor A: ");
		    vetorA[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++) {
		    System.out.print("Digite o " + i + " numero do vetor B: ");
		    vetorB[i] = entrada.nextInt();
		}

		for(int i = 0; i < vetorC.length; i++) {
		    vetorC[i] = vetorA[i] * vetorB[i];
		    System.out.println("Resultado da multiplicacao de " + vetorA[i] + " e " + vetorB[i] + " é: " + vetorC[i]);
		}

		entrada.close();
		
	}
}