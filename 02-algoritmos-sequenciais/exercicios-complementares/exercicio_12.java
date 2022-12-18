import java.util.Scanner;

public class Exercicio_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float anosIdade;
	    
        System.out.print("Digite quantos anos você tem: ");
        anosIdade = input.nextFloat();
        	
        System.out.print("Você viveu " + anosIdade * 365 + " dias");

		input.close();
	}
}