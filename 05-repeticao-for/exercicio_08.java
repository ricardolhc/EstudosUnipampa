import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
	   
	        int soma = 0;
	   
	        for(int i = 0; i < 20; i++) {
	        	System.out.print("Digite o " + (i + 1) + " numero: ");
	        	int n = entrada.nextInt();
	       
	        	if(n * n < 200) {
	                	soma += n;
	       		} 
	   	}
	   	System.out.println("A soma dos numeros cujo o quadrado é menor que 200 é: " + soma);
	}
}
