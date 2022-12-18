import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int[5][5];
		int maiorQueDez = 0;
		             
		for(int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        matriz[i][j] = input.nextInt();
		    }
		}    
		
		for(int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[0].length; j++) {
		        if(matriz[i][j] > 10) {
		            maiorQueDez++;
		        }
		    }
		}
		
		System.out.print("Quantidade de valores maiores que 10: " + maiorQueDez);

		input.close();
	}
}