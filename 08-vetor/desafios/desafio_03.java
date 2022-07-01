import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int [] vetorA = new int [8];
		int [] vetorB = new int [8];
		
		Scanner entrada = new Scanner(System.in);
		
		int valorEscolhido;
		
		for(int i = 0; i < 8; i++) {
		    
		    do {
		        
		        System.out.print("Digite o " + (i + 1) + " numero: ");
		        valorEscolhido = entrada.nextInt();
		        
		        if(valorEscolhido < 0) {
		            System.out.println("Valor Inválido");
		        }
		        
		        
		    } while(valorEscolhido < 0);
		    
		    vetorA[i] = valorEscolhido;
		    int numFatorial = 1;
		    
		    for(int j = 1; j <= valorEscolhido; j++) {
		        numFatorial = numFatorial * j; 
		    }
		    vetorB[i] = numFatorial;
		}
		
		for(int i = 0; i < 8; i++) {
		    System.out.println("Valor: " + vetorA[i] + " Fatorial: " + vetorB[i]);
		}
		
		
	}
}
