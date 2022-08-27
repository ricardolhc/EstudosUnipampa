import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int jogadasDado[] = new int[20];
		int numeroDado;
		int numeroUm = 0, numeroDois = 0, numeroTres = 0, numeroQuatro = 0, numeroCinco = 0, numeroSeis = 0;
		
		for(int i = 0; i < jogadasDado.length; i++) {
		    
		    do {
		        
		        System.out.print("Digite o numero do dado: ");
		        numeroDado = entrada.nextInt();
		        
		        if(numeroDado < 1 || numeroDado > 6) {
		            System.out.println("Número inválido!");
		        }
		        
		    } while(numeroDado < 1 || numeroDado > 6);
		    
		    jogadasDado[i] = numeroDado;
		    
		    if(numeroDado == 1) {
		        numeroUm++;
		    } else if(numeroDado == 2) {
		        numeroDois++;
		    } else if(numeroDado == 3) {
		        numeroTres++;
		    } else if(numeroDado == 4) {
		        numeroQuatro++;
		    } else if(numeroDado == 5) {
		        numeroCinco++;
		    } else if(numeroDado == 6) {
		        numeroSeis++;
		    }
		}
		
		System.out.print("Sequencia de numeros sorteados: ");
		
		for(int i = 0; i < jogadasDado.length; i++) {
		    System.out.print(jogadasDado[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Quantidade de numero 1 sorteados: " + numeroUm);
		System.out.println("Quantidade de numero 2 sorteados: " + numeroDois);
		System.out.println("Quantidade de numero 3 sorteados: " + numeroTres);
		System.out.println("Quantidade de numero 4 sorteados: " + numeroQuatro);
		System.out.println("Quantidade de numero 5 sorteados: " + numeroCinco);
		System.out.println("Quantidade de numero 6 sorteados: " + numeroSeis);

		entrada.close();
		
	}
}