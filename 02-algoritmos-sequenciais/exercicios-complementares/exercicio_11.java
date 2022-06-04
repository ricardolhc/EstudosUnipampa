import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite o primeiro numero: ");
        	float a = sc.nextFloat();
        	
        	System.out.print("Digite o segundo numero: ");
        	float b = sc.nextFloat();
        	
        	System.out.print("Digite o terceiro numero: ");
        	float c = sc.nextFloat();
            
            	System.out.print("O resultado da expressão (" + a + " - " + c + ") * " + b + " é: " + (a - c) * b);
	}
}
