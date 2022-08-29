import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

		int n1, n2;
	    
	    System.out.print("N1 = ");
		n1 = input.nextInt();
		
		System.out.print("N2 = ");
		n2 = input.nextInt();
		
		if(n1 > n2) {
		    System.out.print("Maior = " + n1 + " Menor = " + n2);
		} else {
		    System.out.print("Maior = " + n2 + " Menor = " + n1);
		}

		input.close();
	}
}
