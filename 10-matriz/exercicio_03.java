import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		int n[][] = new int[6][6];
		             
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        n[i][j] = entrada.nextInt();
		    }
		}    
		
		int soma_diagonal_principal = 0;
		
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        if(i == j) {
		            soma_diagonal_principal += n[i][j];
		        }
		    }
		}
		
		System.out.print("Soma da diagonal principal: " + soma_diagonal_principal);
		 
	}
}