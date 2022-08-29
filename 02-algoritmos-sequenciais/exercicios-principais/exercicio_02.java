import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float n1, n2;
	    
        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextFloat();
        
        System.out.print("Digite o segundo numero: ");
        n2 = input.nextFloat();
	    
    	System.out.println("A soma de " + n1 + " + " + n2 + " é: " + (n1 + n2));

		input.close();
	}
}
