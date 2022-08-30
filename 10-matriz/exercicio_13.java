import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		float matriz[][] = new float[10][12];
        int maiorMesConsumo = 0;
        int anoMaiorConsumo = 0;
		             
		for(int i = 0; i < matriz.length; i++) {
            System.out.println("Consumo ano 200" + (i));
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite o valor do consumo do mês " + (j + 1) + ": ");
		        matriz[i][j] = input.nextFloat();
		    }
		}

        float maiorConsumo = matriz[0][0];

        System.out.println();

		for(int i = 0; i < matriz[0].length; i++) {
            float mediaMes = 0;
            int k = 0;
            for(int j = 0; j < matriz.length; j++) {
                mediaMes += matriz[j][i];
                k++;
            }
            mediaMes /= k;
            System.out.println("Média de consumo do mês " + (i + 1) + ": " + mediaMes);
        }

        System.out.println();
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                if(maiorConsumo < matriz[i][j]) {
                    maiorConsumo = matriz[i][j];
                    maiorMesConsumo = j;
                    anoMaiorConsumo = i;
                }
            }
        }

        System.out.println("O ano com o maior consumo foi 200" + anoMaiorConsumo + " no mês " + (maiorMesConsumo + 1));

		input.close();
	}
}