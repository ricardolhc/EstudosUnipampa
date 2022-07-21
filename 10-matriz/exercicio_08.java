import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		int A[][] = new int[4][4];
		int B[][] = new int[4][4];
		             
		System.out.println("Digite os valores do vetor A");
		for(int i = 0; i < A.length; i++){
		    for(int j = 0; j < A[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        A[i][j] = entrada.nextInt();
		    }
		}
		
		System.out.println("Digite os valores do vetor B");
		for(int i = 0; i < B.length; i++){
		    for(int j = 0; j < B[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        B[i][j] = entrada.nextInt();
		    }
		}
		
		for(int i = 0; i < A.length; i++) {
		    for(int j = 0; j < A[0].length; j++) {
		        if(procurarNumNaMatriz(A[i][j], B)) {
		            System.out.println(A[i][j]);
		        }
		    }
		}

	}
	
	static public boolean procurarNumNaMatriz(int num, int matriz[][]) {
	    for(int i = 0; i < matriz.length; i++) {
	        for(int j = 0; j < matriz[0].length; j++) {
	            if(num == matriz[i][j]) {
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
}