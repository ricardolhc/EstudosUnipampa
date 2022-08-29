import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float lado, volume;
	    
        System.out.print("Digite o lado de um cubo: ");
        lado = input.nextFloat();
        
        volume = lado * lado * lado;
        
        System.out.println("O volume do cubo é: " + volume + "un³");

		input.close();
	}
}
