import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite quantos anos você tem: ");
        	float idade_anos = sc.nextFloat();
        	
        	System.out.print("Você viveu " + idade_anos * 365 + " dias");
	}
}