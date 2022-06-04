import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite a base do retangulo: ");
        	float base = sc.nextFloat();
        
        	System.out.print("Digite a altura do retangulo: ");
        	float altura = sc.nextFloat();
        
        	System.out.print("A área do retangulo é: " + altura * base);
	}
}