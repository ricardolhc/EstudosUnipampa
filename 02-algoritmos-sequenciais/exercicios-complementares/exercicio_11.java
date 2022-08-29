import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float n1, n2, n3;
	    
        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextFloat();
        	
        System.out.print("Digite o segundo numero: ");
        n2 = input.nextFloat();
        	
        System.out.print("Digite o terceiro numero: ");
        n3 = input.nextFloat();
            
        System.out.print("O resultado da expressão (" + n1 + " - " + n3 + ") * " + n2 + " é: " + (n1 - n3) * n2);

		input.close();
	}
}
