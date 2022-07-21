import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		int matriz[][] = new int[2][3];
		int matriz_transposta[][] = new int[3][2];
		             
		for(int i = 0; i < matriz.length; i++){
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        matriz[i][j] = entrada.nextInt();
		    }
		}

		for(int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[0].length; j++) {
		        matriz_transposta[j][i] = matriz[i][j];
		    }
		}
		
		for(int i = 0; i < matriz_transposta.length; i++) {
		    for(int j = 0; j < matriz_transposta[0].length; j++) {
		        System.out.print(matriz_transposta[i][j] + " ");
		    }
		    System.out.println();
		}

	}
	
}