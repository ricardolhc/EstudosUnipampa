import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Hora = ");
	    int hora = entrada.nextInt();
	    
	    System.out.print("Minutos = ");
	    int minutos = entrada.nextInt();
	    
	    if(hora < 0 || hora > 23) {
	        System.out.println("Hora incorreta");
	        if(minutos < 0 || minutos > 59) {
	            System.out.print("Minutos incorretos");
	        }
	    } else if(minutos < 0 || minutos > 59) {
	        System.out.print("Minutos incorretos");
	    } else {
	        System.out.print(((hora * 3600) + (minutos * 60)) + " segundos");
	    }
	}
}
