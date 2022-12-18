import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float n1, n2, n3;
	    
        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextFloat();
        
    	System.out.print("Digite o segundo numero: ");
        n2 = input.nextFloat();
        
        System.out.print("Digite o terceiro numero: ");
        n3 = input.nextFloat();
	    
        System.out.println("A media dos numeros digitados é: " + (n1 + n2 + n3) / 3);

		input.close();
	}
}
