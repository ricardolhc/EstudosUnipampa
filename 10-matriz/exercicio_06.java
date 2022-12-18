import java.util.Scanner;

public class Exercicio_06 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int[2][4];

		int x;
		boolean encontrado = false;
		             
		for(int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        matriz[i][j] = input.nextInt();
		    }
		}    
		
		System.out.print("Digite um valor: ");
		x = input.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
		    for(int j = 0; j < matriz[0].length; j++) {
		        if(x == matriz[i][j]) {
		            encontrado = true;
		            System.out.println("Linha: " + i + " Coluna: " + j);
		        }
		    }
		} 
		
		if(!encontrado) {
		    System.out.print("Não encontrado");
		}

		input.close();
	}
}