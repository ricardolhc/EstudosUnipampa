import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		int n[][] = new int[2][4];
		             
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        n[i][j] = entrada.nextInt();
		    }
		}    
		
		int x;
		boolean encontrado = false;
		
		System.out.print("Digite um valor: ");
		x = entrada.nextInt();
		
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        if(x == n[i][j]) {
		            encontrado = true;
		            System.out.println("Linha: " + i + " Coluna: " + j);
		        }
		    }
		} 
		
		if(encontrado == false) {
		    System.out.print("Não encontrado");
		}
	}
}