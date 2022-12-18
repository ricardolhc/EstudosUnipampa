import java.util.Scanner;

public class Exercicio_07 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] n = new int [10];
		
		for(int i = 0; i < n.length; i++) {
		    System.out.print("Digite o " + (i + 1) + " valor: ");
		    n[i] = input.nextInt();
		}
		
		for(int i = 0; i < n.length; i++) {
		    if(n[i] < 0) {
		        n[i] = 0;
		    }
		    System.out.print(n[i] + " ");
		}

		input.close();
		
	}
}