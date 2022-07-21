import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		int n[][] = new int[3][3];
		             
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        n[i][j] = entrada.nextInt();
		    }
		}    
		
		
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        if(j > i) {
		            n[i][j] = 0;
		        }
		    }
		}
		
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        System.out.print(n[i][j] + " ");
		    }
		    System.out.println();
		}
		 
	}
}