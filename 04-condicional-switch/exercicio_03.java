import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

		int numero;
	    
	    System.out.print("Digite um numero (1-4): ");
	    numero = input.nextInt();
	    
	    switch(numero) {
	        case 1:
	            System.out.print("Verão");
	            break;
	            
	        case 2:
	            System.out.print("Outono");
	            break;
	            
	        case 3:
	            System.out.print("Inverno");
	            break;
	            
	        case 4:
	            System.out.print("Primavera");
	            break;
	            
	        default:
	            System.out.print("Número inválido!");
	            break;
	    }

		input.close();
	}
}
