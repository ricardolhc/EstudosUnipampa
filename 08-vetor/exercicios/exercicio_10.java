import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [] n = new int [10];
		
		for(int i = 0; i < 10; i++) {
		    System.out.print("Digite o " + (i + 1) + " valor: ");
		    n[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
		    for(int j = 0; j < 10; j++) {
		        if(n[i] == n[j] && i != j) {
		            System.out.print(n[i] + " ");
		        }
		    }
		}
		
	}
}