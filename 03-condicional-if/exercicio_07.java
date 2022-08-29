import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

		int hora, minutos;
	    
	    System.out.print("Hora = ");
	    hora = input.nextInt();
	    
	    System.out.print("Minutos = ");
	    minutos = input.nextInt();
	    
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

		input.close();
	}
}
