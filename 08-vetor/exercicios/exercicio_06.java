import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int valor;
		boolean achou = false;
		
		for(int i = 0; i < 10; i++) {
		    System.out.print("Digite o " + i + " numero: ");
		    vetor[i] = entrada.nextInt();
		}
		
		System.out.print("Digite um valor: ");
		valor = entrada.nextInt();
		
		for(int i = 0; i < 10; i++) {
		    if(valor == vetor[i]) {
		        achou = true;
		        System.out.println("Encontrado na posicao " + i);
		    }
		}
		
		if(achou == false) {
		    System.out.print("Não encontrado");
		}
	
	}
}
