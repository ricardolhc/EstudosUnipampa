import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		int matriz[][] = new int[3][5];
		int soma_linha_matriz[] = new int[3];
		             
		for(int i = 0; i < matriz.length; i++){
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        matriz[i][j] = entrada.nextInt();
		    }
		}

		for(int i = 0; i < matriz.length; i++) {
		    soma_linha_matriz[i] = 0;
		    for(int j = 0; j < matriz[0].length; j++) {
		        soma_linha_matriz[i] += matriz[i][j];
		    }
		}
		
		for(int i = 0; i < soma_linha_matriz.length; i++) {
		    System.out.println("Soma da linha " + (i + 1) + " da matriz: " + soma_linha_matriz[i]); 
		}

	}
	
}