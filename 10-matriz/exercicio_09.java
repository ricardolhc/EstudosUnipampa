import java.util.Scanner;

public class Exercicio_09 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int[2][3];
		int matrizTransposta[][] = new int[3][2];
		             
		for(int i = 0; i < matriz.length; i++){
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        matriz[i][j] = input.nextInt();
		    }
		}

		for(int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[0].length; j++) {
		        matrizTransposta[j][i] = matriz[i][j];
		    }
		}
		
		for(int i = 0; i < matrizTransposta.length; i++) {
		    for(int j = 0; j < matrizTransposta[0].length; j++) {
		        System.out.print(matrizTransposta[i][j] + " ");
		    }
		    System.out.println();
		}

		input.close();
	}
}