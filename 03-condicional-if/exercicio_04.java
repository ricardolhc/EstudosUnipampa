import java.util.Scanner;

public class Exercicio_04 {
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

		int pessoas;
	    
	    System.out.print("Publico = ");
		pessoas = input.nextInt();
		
		System.out.print("Publico ");
		
		if(pessoas < 5000) {
		    System.out.print("Fraco");
		} else if(pessoas >= 5000 && pessoas <= 20000) {
		    System.out.print("Bom");
		} else {
		    System.out.print("Excelente");
		}
		
		input.close();
	}
}
