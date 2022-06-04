import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite a base do retangulo: ");
        	float base = sc.nextFloat();
        
        	System.out.print("Digite a altura do retangulo: ");
        	float altura = sc.nextFloat();
        
        	float perimetro = 2 * (base + altura);
        	float area = altura * base;
        
        	System.out.println("O perimetro do retangulo é: " + perimetro + "un");
        	System.out.println("A area do retangulo é: " + area + "un²");
	}
}
