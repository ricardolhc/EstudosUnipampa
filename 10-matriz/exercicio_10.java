import java.util.Scanner;

public class Exercicio_10 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int[3][5];
		int somaLinhaMatriz[] = new int[3];
		             
		for(int i = 0; i < matriz.length; i++){
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        matriz[i][j] = input.nextInt();
		    }
		}

		for(int i = 0; i < matriz.length; i++) {
		    somaLinhaMatriz[i] = 0;
		    for(int j = 0; j < matriz[0].length; j++) {
		        somaLinhaMatriz[i] += matriz[i][j];
		    }
		}
		
		for(int i = 0; i < somaLinhaMatriz.length; i++) {
		    System.out.println("Soma da linha " + (i + 1) + " da matriz: " + somaLinhaMatriz[i]); 
		}

		input.close();
	}
}