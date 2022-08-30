import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
	   
		int qtd_aluno = 10;
	    int qtd_prova = 3;
	   
	    for(int i = 0; i < qtd_aluno; i++) {
	        int somaNota = 0;

	        for(int j = 0; j < qtd_prova; j++) {
				float nota;

	           	System.out.print("Digite a " + (j + 1) + " nota do aluno " + (i + 1) + ": ");
	           	nota = input.nextFloat();
	           	somaNota += nota;
	       	}

	       	if((somaNota / qtd_prova) >= 6) {
	           	System.out.println("Parabéns Aprovado!");
	       	} else {
	       		System.out.println("Você foi Reprovado!");
	       	}
	   	}

		input.close();
	}
}
