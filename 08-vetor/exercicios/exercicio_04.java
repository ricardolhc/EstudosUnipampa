import java.util.Scanner;

public class Exercicio_04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] n = new int [10];
		int par = 0;
		
		for(int i = 0; i < n.length; i++) {
		    System.out.print("Digite o " + (i + 1) + " valor: ");
		    n[i] = input.nextInt();
		}
		
		for(int i = 0; i < n.length; i++) {
		    if(n[i] % 2 == 0) {
		        par++;
		    }
		}
		
		System.out.print("O vetor possui " + par + " pares");

		input.close();
	}
}