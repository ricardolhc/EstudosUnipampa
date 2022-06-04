import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Publico = ");
		int pessoas = entrada.nextInt();
		
		System.out.print("Publico ");
		
		if(pessoas < 5000) {
		    System.out.print("Fraco");
		} else if(pessoas >= 5000 && pessoas <= 20000) {
		    System.out.print("Bom");
		} else {
		    System.out.print("Excelente");
		}
		
	}
}
