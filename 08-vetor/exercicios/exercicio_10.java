import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] n = new int [10];
		
		for(int i = 0; i < n.length; i++) {
		    System.out.print("Digite o " + (i + 1) + " valor: ");
		    n[i] = input.nextInt();
		}
		
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < 10; j++) {
		        if(n[i] == n[j] && i != j) {
		            System.out.print(n[i] + " ");
		        }
		    }
		}

		input.close();
	}
}