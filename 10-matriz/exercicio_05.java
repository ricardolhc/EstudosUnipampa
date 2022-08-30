import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int[4][3];

		int menorValor, colunaMenorValor = 0, linhaMenorValor = 0;
		             
		for(int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        matriz[i][j] = input.nextInt();
		    }
		}    
		
		menorValor = matriz[0][0];
		
		for(int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[0].length; j++) {
		        if(matriz[i][j] < menorValor) {
		            menorValor = matriz[i][j];
		            colunaMenorValor = j;
		            linhaMenorValor = i;
		        }
		    }
		} 
		
		System.out.print("Menor valor: " + menorValor + " Linha: " + linhaMenorValor + " Coluna: " + colunaMenorValor);
		 
		input.close();
	}
}