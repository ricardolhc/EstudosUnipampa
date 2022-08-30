import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
	   
		int qtd_par = 0;
		int qtd_impar = 0;
	   
	    for(int i = 0; i < 10; i++) {
			int numero;

	    	System.out.print("Digite o " + (i + 1) + " numero: ");
	    	numero = input.nextInt();
	       
	        if(numero % 2 == 0) {
	    		qtd_par++;
	        } else {
	            qtd_impar++;
	    	}
	   	}
	   
	   	System.out.println("A quantidade de numeros pares é: " + qtd_par);
	   	System.out.println("A quantidade de numeros impares é: " + qtd_impar);

		input.close();
	}
}
