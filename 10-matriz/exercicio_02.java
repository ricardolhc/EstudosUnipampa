import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		int n[][] = new int[5][5];
		             
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        System.out.print("Digite um valor para a matriz[" + i + "][" + j + "]: ");
		        n[i][j] = entrada.nextInt();
		    }
		}    
		
		int maior_que_dez = 0;
		
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        if(n[i][j] > 10) {
		            maior_que_dez++;
		        }
		    }
		}
		
		System.out.print("Quantidade de valores maiores que 10: " + maior_que_dez);
		 
	}
}