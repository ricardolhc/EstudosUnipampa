import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Digite um numero (1-7): ");
	    int numero = entrada.nextInt();
	    
	    switch(numero) {
	        case 1:
	            System.out.print("Domingo");
	            break;
	            
	        case 2:
	            System.out.print("Segunda-feira");
	            break;
	            
	        case 3:
	            System.out.print("Terça-feira");
	            break;
	            
	        case 4:
	            System.out.print("Quarta-feira");
	            break;
	            
	        case 5:
	            System.out.print("Quinta-feira");
	            break;
	            
	        case 6:
	            System.out.print("Sexta-feira");
	            break;
	            
	        case 7:
	            System.out.print("Sábado");
	            break;
	            
	        default:
	            System.out.print("Número inválido!");
	            break;
	    }
	}
}
