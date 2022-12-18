import java.util.Scanner;

public class Exercicio_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int celsius;
		float fahrenheit;
	    
        System.out.print("Digite um valor em graus celsius: ");
        celsius = input.nextInt();
        
        fahrenheit = (celsius * 9 / 5) + 32;
        
        System.out.print(celsius + "ºC equivale a " + fahrenheit + "ºF");

		input.close();
	}
}
