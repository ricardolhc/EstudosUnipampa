import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite o lado de um cubo: ");
        	float lado = sc.nextFloat();
        
        	float volume = lado * lado * lado;
        
        	System.out.println("O volume do cubo é: " + volume + "un³");
	}
}
