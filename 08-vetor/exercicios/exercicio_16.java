import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] a = new int [20];
		int [] b = new int [20];
		
		for(int i = 0; i < a.length; i++) {
		    System.out.print("Digite o " + (i + 1) + " valor: ");
		    a[i] = input.nextInt();
		}
		
		int j = 0;
		
		for(int i = (a.length - 1); i >= 0; i--) {
		    b[i] = a[j];
		    j++;
		}
		
		for(int i = 0; i < a.length; i++) {
		    System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		for(int i = 0; i < a.length; i++) {
		    System.out.print(b[i] + " ");
		}

		input.close();	
	}
}