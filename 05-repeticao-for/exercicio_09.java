import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
	   
		int qtd_aluno = 10;
	        int qtd_prova = 3;
	   
	        for(int i = 0; i < qtd_aluno; i++) {
	        	int soma = 0;
	        	for(int j = 0; j < qtd_prova; j++) {
	           		System.out.print("Digite a " + (j + 1) + " nota do aluno " + (i + 1) + ": ");
	           		float nota = entrada.nextFloat();
	           		soma += nota;
	       		}
	       		if((soma / qtd_prova) >= 6) {
	           		System.out.println("Parabéns Aprovado!");
	       		} else {
	           	System.out.println("Você foi Reprovado!");
	       		}
	   	}
	}
}
