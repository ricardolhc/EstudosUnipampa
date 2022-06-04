import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
	   
		System.out.print("Digite um numero: ");
	        int n = entrada.nextInt();
	   
	        for(int i = 0; i <= 10; i++) {
	        	System.out.println(n + " + " + i + " = " + (n + i));
	        }
	}
}
