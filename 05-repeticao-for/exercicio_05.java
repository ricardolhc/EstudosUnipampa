import java.util.Scanner;

public class Exercicio_05 {
    
	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);

		int numero;
	   
		System.out.print("Digite um numero: ");
	    numero = input.nextInt();
	   
	    for(int i = 0; i <= 10; i++) {
	        System.out.println(numero + " + " + i + " = " + (numero + i));
	    }

		input.close();
	}
}
