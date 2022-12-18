import java.util.Scanner;

public class Exercicio_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float base, altura;
	    
        System.out.print("Digite a base do retangulo: ");
        base = input.nextFloat();
        
    	System.out.print("Digite a altura do retangulo: ");
    	altura = input.nextFloat();
        
      	System.out.print("A área do retangulo é: " + altura * base);

		input.close();
	}
}