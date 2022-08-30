import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int[6][6];
		int somaDiagonalPrincipal = 0;
		             
		for(int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        matriz[i][j] = input.nextInt();
		    }
		}    
		
		for(int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[0].length; j++) {
		        if(i == j) {
		            somaDiagonalPrincipal += matriz[i][j];
		        }
		    }
		}
		
		System.out.print("Soma da diagonal principal: " + somaDiagonalPrincipal);

		input.close();
	}
}