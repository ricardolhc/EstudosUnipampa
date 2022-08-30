import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int motoresProduzidos[][] = new int[3][2];
		int motoresNegocios[][] = new int[2][2];
		int lucroAnual = 0;
		
		for(int i = 0; i < motoresProduzidos.length; i++) {
		    System.out.println("Mês " + (i + 1));
		    for(int j = 0; j < motoresProduzidos[0].length; j++) {
		        System.out.print("Digite a quantidade produzida do motor M" + (j + 1) + ": ");
		        motoresProduzidos[i][j] = input.nextInt();
		    }
		}
		
		System.out.println();
		
		for(int i = 0; i < motoresNegocios.length; i++) {
		    System.out.println("Motor M" + (i + 1));
		    for(int j = 0; j < motoresNegocios[0].length; j++) {
		        if(j == 0) {
		            System.out.print("Digite o lucro: ");
		        } else {
		            System.out.print("Digite o custo: ");
		        }
		        motoresNegocios[i][j] = input.nextInt();
		    }
		}  
		
		System.out.println();
		
		for(int i = 0; i < motoresProduzidos.length; i++) {
		    System.out.print("Mês " + (i + 1) + "   ");
		    int custoMes = 0;
		    int lucroMes = 0;

		    for(int j = 0; j < motoresProduzidos[0].length; j++) {
		        for(int k = 0; k < motoresNegocios.length; k++) {
		            if(k == 0) {
		                lucroMes += motoresProduzidos[i][j] * motoresNegocios[j][k];
		            } else {
		                custoMes += motoresProduzidos[i][j] * motoresNegocios[j][k];
		            }
		        }
		    }
		    lucroAnual += lucroMes;
		    System.out.println("Custo: " + custoMes + "   Lucro: " + lucroMes);
		}
		
		System.out.println("Lucro Anual: " + lucroAnual);
		
		input.close();
	}
}
