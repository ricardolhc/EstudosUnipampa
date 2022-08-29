import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float n;
	    
        System.out.print("Digite um numero: ");
        n = input.nextFloat();
            
        System.out.print("O sucessor de " + n + " é: " + (++n));

		input.close();
	}
}
