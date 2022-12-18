import java.util.Scanner;

public class Exercicio_06 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int valor;
		boolean achou = false;
		
		for(int i = 0; i < vetor.length; i++) {
		    System.out.print("Digite o " + i + " numero: ");
		    vetor[i] = input.nextInt();
		}
		
		System.out.print("Digite um valor: ");
		valor = input.nextInt();
		
		for(int i = 0; i < vetor.length; i++) {
		    if(valor == vetor[i]) {
		        achou = true;
		        System.out.println("Encontrado na posicao " + i);
		    }
		}
		
		if(achou == false) {
		    System.out.print("Não encontrado");
		}

		input.close();
	
	}
}
