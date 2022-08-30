import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		float matriz[][] = new float[12][4];
        float vendaAno = 0;
		             
		for(int i = 0; i < matriz.length; i++) {
            System.out.println("Mês " + (i + 1));
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite o valor da venda da semana " + (j + 1) + ": ");
		        matriz[i][j] = input.nextFloat();
		    }
		}

        System.out.println();

        for(int i = 0; i < matriz.length; i++) {
            float vendaMes = 0;
            for(int j = 0; j < matriz[0].length; j++) {
                vendaMes += matriz[i][j];
            }
            System.out.println("Venda do mês " + (i + 1) + ": " + vendaMes);
        }

        System.out.println();

		for(int i = 0; i < matriz[0].length; i++) {
            float vendaSemana = 0;
            for(int j = 0; j < matriz.length; j++) {
                vendaSemana += matriz[j][i];
            }
            System.out.println("Venda da semana " + (i + 1) + ": " + vendaSemana);
        }

        System.out.println();

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                vendaAno += matriz[i][j];
            }
        }

        System.out.print("Total das vendas do ano: " + vendaAno);

		input.close();
	}
}