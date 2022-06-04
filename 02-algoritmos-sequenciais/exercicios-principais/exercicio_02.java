import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite o primeiro numero: ");
        	float n1 = sc.nextFloat();
        
        	System.out.print("Digite o segundo numero: ");
        	float n2 = sc.nextFloat();
	    
        	System.out.println("A soma de " + n1 + " + " + n2 + " é: " + (n1 + n2));
	}
}
