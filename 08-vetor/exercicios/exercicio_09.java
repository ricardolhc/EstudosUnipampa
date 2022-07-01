import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double vetor[] = new double[10];
		int igualDez = 0, maiorMedia = 0, igualMedia = 0;
		double media = 0;
		
		for(int i = 0; i < 10; i++) {
		    System.out.print("Digite o " + i + " valor: ");
		    vetor[i] = entrada.nextDouble();
		    media += vetor[i];
		}
		
	    media /= 10;
	    
	    for(int i = 0; i < 10; i++) {
	        if(vetor[i] == 10) {
	            igualDez++;
	        }
	        if(vetor[i] > media) {
	            maiorMedia++;
	        }
	        if(vetor[i] == media) {
	            igualMedia++;
	        }
	    }
	    
	    System.out.println("Quantidade de numeros igual a 10: " + igualDez);
	    System.out.println("Quantidade de numeros maior que a media: " + maiorMedia);
	    System.out.println("Quantidade de numeros igual a media: " + igualMedia);
		
	}
}