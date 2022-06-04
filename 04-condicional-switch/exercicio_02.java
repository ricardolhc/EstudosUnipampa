import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Digite um numero (0-9): ");
	    int numero = entrada.nextInt();
	    
	    switch(numero) {
	        case 0:
	            System.out.print("Zero");
	            break;
	            
	        case 1:
	            System.out.print("Um");
	            break;
	            
	        case 2:
	            System.out.print("Dois");
	            break;
	            
	        case 3:
	            System.out.print("Três");
	            break;
	            
	        case 4:
	            System.out.print("Quatro");
	            break;
	            
	        case 5:
	            System.out.print("Cinco");
	            break;
	            
	        case 6:
	            System.out.print("Seis");
	            break;
	            
	        case 7:
	            System.out.print("Sete");
	            break;
	            
	        case 8:
	            System.out.print("Oito");
	            break;
	            
	        case 9:
	            System.out.print("Nove");
	            break;
	            
	        default:
	            System.out.print("Número inválido!");
	            break;
	    }
	}
}
