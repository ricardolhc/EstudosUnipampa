import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int matrizA[][] = new int[4][4];
		int matrizB[][] = new int[4][4];
		             
		System.out.println("Digite os valores do vetor A");
		for(int i = 0; i < matrizA.length; i++){
		    for(int j = 0; j < matrizA[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        matrizA[i][j] = input.nextInt();
		    }
		}
		
		System.out.println("Digite os valores do vetor B");
		for(int i = 0; i < matrizB.length; i++){
		    for(int j = 0; j < matrizB[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        matrizB[i][j] = input.nextInt();
		    }
		}
		
		for(int i = 0; i < matrizA.length; i++) {
		    for(int j = 0; j < matrizA[0].length; j++) {
		        if(procurarNumNaMatriz(matrizA[i][j], matrizB)) {
		            System.out.println(matrizA[i][j]);
		        }
		    }
		}

		input.close();
	}
	
	static public boolean procurarNumNaMatriz(int nummero, int matriz[][]) {
	    for(int i = 0; i < matriz.length; i++) {
	        for(int j = 0; j < matriz[0].length; j++) {
	            if(nummero == matriz[i][j]) {
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
}