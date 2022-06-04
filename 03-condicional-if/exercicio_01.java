import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("N1 = ");
		int n1 = entrada.nextInt();
		
		System.out.print("N2 = ");
		int n2 = entrada.nextInt();
		
		if(n1 > n2) {
		    System.out.print("Maior = " + n1 + " Menor = " + n2);
		} else {
		    System.out.print("Maior = " + n2 + " Menor = " + n1);
		}
	}
}
