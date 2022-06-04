import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Digite um valor: ");
	    float valor = entrada.nextFloat();
	    
	    System.out.print("Digite um numero (1-4): ");
	    int numero = entrada.nextInt();
	    
	    switch(numero) {
	        case 1:
	            System.out.print("1x = " + valor * 0.7);
	            break;
	            
	        case 2:
	            System.out.print("2x = " + (valor * 0.8) / 2);
	            break;
	            
	        case 3:
	            System.out.print("3x = " + (valor * 0.9) / 3);
	            break;
	            
	        case 4:
	            System.out.println("4x = " + valor / 4);
	            System.out.println("5x = " + valor / 5);
	            System.out.println("6x = " + valor / 6);
	            break;
	            
	        default:
	            System.out.print("Número inválido!");
	            break;
	    }
	}
}
