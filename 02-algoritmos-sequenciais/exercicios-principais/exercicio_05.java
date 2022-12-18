import java.util.Scanner;

public class Exercicio_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float base, altura;
		float perimetro, area;
	    
        System.out.print("Digite a base do retangulo: ");
        base = input.nextFloat();
        
        System.out.print("Digite a altura do retangulo: ");
        altura = input.nextFloat();
        
    	perimetro = 2 * (base + altura);
        area = altura * base;
        
        System.out.println("O perimetro do retangulo é: " + perimetro + "un");
        System.out.println("A area do retangulo é: " + area + "un²");

		input.close();
	}
}
