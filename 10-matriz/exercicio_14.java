import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int motores_produzidos[][] = new int[3][2];
		int motores_negocios[][] = new int[2][2];
		
		for(int i = 0; i < motores_produzidos.length; i++) {
		    System.out.println("Mês " + (i + 1));
		    for(int j = 0; j < motores_produzidos[0].length; j++) {
		        System.out.print("Digite a quantidade produzida do motor M" + (j + 1) + ": ");
		        motores_produzidos[i][j] = entrada.nextInt();
		    }
		}
		
		System.out.println();
		
		for(int i = 0; i < motores_negocios.length; i++) {
		    System.out.println("Motor M" + (i + 1));
		    for(int j = 0; j < motores_negocios[0].length; j++) {
		        if(j == 0) {
		            System.out.print("Digite o lucro: ");
		        } else {
		            System.out.print("Digite o custo: ");
		        }
		        motores_negocios[i][j] = entrada.nextInt();
		    }
		}  
		
		System.out.println();
		
		for(int i = 0; i < motores_produzidos.length; i++) {
		    System.out.print("Mês " + (i + 1) + "   ");
		    int custo_mes = 0;
		    int lucro_mes = 0;
		    for(int j = 0; j < motores_produzidos[0].length; j++) {
		        for(int k = 0; k < motores_negocios.length; k++) {
		            if(k == 0) {
		                lucro_mes += motores_produzidos[i][j] * motores_negocios[j][k];
		            } else {
		                custo_mes += motores_produzidos[i][j] * motores_negocios[j][k];
		            }
		        }
		    }
		    System.out.println("Custo: " + custo_mes + "   Lucro: " + lucro_mes);
		}
		
	}
}
