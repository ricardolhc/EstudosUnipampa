import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
	   
	        int qtd_par = 0;
	        int qtd_impar = 0;
	   
	        int soma_par = 0;
	        int soma_impar = 0;
	   
	        for(int i = 0; i < 20; i++) {
	        	System.out.print("Digite o " + (i + 1) + " numero: ");
	        	int n = entrada.nextInt();
	       
	        	if(n % 2 == 0) {
	           		soma_par += n;
	           		qtd_par++;
	       		} else {
	           		soma_impar += n;
	           		qtd_impar++;
	       		}
	   	}
	   
	   	System.out.println("A media dos numeros pares é: " + soma_par / qtd_par);
	   	System.out.println("A media dos numeros impares é: " + soma_impar / qtd_impar);
	}
}
