import java.util.Scanner;

public class Exercicio_08 {
    
	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
	   
	    int soma = 0;
	   
	    for(int i = 0; i < 20; i++) {
			int numero;

	        System.out.print("Digite o " + (i + 1) + " numero: ");
	        numero = input.nextInt();
	       
	        if(numero * numero < 200) {
	            soma += numero;
	       	} 
	   	}

	   	System.out.println("A soma dos numeros cujo o quadrado é menor que 200 é: " + soma);

		input.close();
	}
}
