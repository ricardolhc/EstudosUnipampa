import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int [] vetorA = new int [8];
		int [] vetorB = new int [8];
		
		Scanner input = new Scanner(System.in);
		
		int valorEscolhido;
		
		for(int i = 0; i < vetorA.length; i++) {

			int numFatorial = 1;
		    
		    do {
		        
		        System.out.print("Digite o " + (i + 1) + " numero: ");
		        valorEscolhido = input.nextInt();
		        
		        if(valorEscolhido < 0) {
		            System.out.println("Valor Inválido");
		        }
		        
		        
		    } while(valorEscolhido < 0);
		    
		    vetorA[i] = valorEscolhido;
		    
		    for(int j = 1; j <= valorEscolhido; j++) {
		        numFatorial = numFatorial * j; 
		    }
		    vetorB[i] = numFatorial;
		}
		
		for(int i = 0; i < vetorB.length; i++) {
		    System.out.println("Valor: " + vetorA[i] + " Fatorial: " + vetorB[i]);
		}
		
		input.close();
	}
}
