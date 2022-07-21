import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		int n[][] = new int[4][3];
		             
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        n[i][j] = entrada.nextInt();
		    }
		}    
		
		int menor_valor = n[0][0];
		int coluna_menor_valor = 0;
		int linha_menor_valor = 0;
		
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        if(n[i][j] < menor_valor) {
		            menor_valor = n[i][j];
		            coluna_menor_valor = j;
		            linha_menor_valor = i;
		        }
		    }
		} 
		
		System.out.print("Menor valor: " + menor_valor + " Linha: " + linha_menor_valor + " Coluna: " + coluna_menor_valor);
		 
	}
}