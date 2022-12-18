import java.util.Scanner;

public class Exercicio_15 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int jogadasDado[] = new int[20];
		int numeroDado;
		int numeroUm = 0, numeroDois = 0, numeroTres = 0, numeroQuatro = 0, numeroCinco = 0, numeroSeis = 0;
		
		for(int i = 0; i < jogadasDado.length; i++) {
		    
		    do {
		        
		        System.out.print("Digite o numero do dado: ");
		        numeroDado = input.nextInt();
		        
		        if(numeroDado < 1 || numeroDado > 6) {
		            System.out.println("Número inválido!");
		        }
		        
		    } while(numeroDado < 1 || numeroDado > 6);
		    
		    jogadasDado[i] = numeroDado;

			switch(numeroDado) {
				case 1:
					numeroUm++;
					break;

				case 2:
					numeroDois++;
					break;

				case 3:
					numeroTres++;
					break;

				case 4:
					numeroQuatro++;
					break;
				
				case 5:
					numeroCinco++;
					break;

				case 6:
					numeroSeis++;
					break;
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

		input.close();
	}
}