import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Peso (kg) = ");
		float peso = entrada.nextFloat();
		
		System.out.print("Altura (m) = ");
		float altura = entrada.nextFloat();
		
		float imc = (peso / (altura * altura));
		
		System.out.print("IMC = ");
		System.out.format("%.2f", imc);
		
		if(imc < 18.5) {
		    System.out.print(" : Abaixo do peso ideal");
		} else if(imc >= 18.5 && imc <= 24.9) {
		    System.out.print(" : Peso ideal");
		} else if(imc >= 25 && imc <= 29.9) {
		    System.out.print(" : Acima do peso (sobrepeso)");
		} else {
		    System.out.print(" : Obesidade");
		}
	}
}
