import java.util.Scanner;

public class Exercicio_06 {
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

		float peso, altura, imc;
	    
	    System.out.print("Peso (kg) = ");
		peso = input.nextFloat();
		
		System.out.print("Altura (m) = ");
		altura = input.nextFloat();
		
		imc = (peso / (altura * altura));
		
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

		input.close();
	}
}
