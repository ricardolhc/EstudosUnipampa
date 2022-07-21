import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		float n[][] = new float[10][12];
		             
		for(int i = 0; i < n.length; i++) {
            System.out.println("Consumo ano 200" + (i));
		    for(int j = 0; j < n[0].length; j++) {
		        System.out.print("Digite o valor do consumo do mês " + (j + 1) + ": ");
		        n[i][j] = entrada.nextFloat();
		    }
		}
        
        System.out.println();

		for(int i = 0; i < n[0].length; i++) {
            float media_mes = 0;
            int k = 0;
            for(int j = 0; j < n.length; j++) {
                media_mes += n[j][i];
                k++;
            }
            media_mes /= k;
            System.out.println("Média de consumo do mês " + (i + 1) + ": " + media_mes);
        }

        System.out.println();

        float maior_consumo = n[0][0];
        int maior_mes_consumo = 0;
        int ano_maior_consumo = 0;

        for(int i = 0; i < n.length; i++) {
            for(int j = 0; j < n[0].length; j++) {
                if(maior_consumo < n[i][j]) {
                    maior_consumo = n[i][j];
                    maior_mes_consumo = j;
                    ano_maior_consumo = i;
                }
            }
        }

        System.out.println("O ano com o maior consumo foi 200" + ano_maior_consumo + " no mês " + (maior_mes_consumo + 1));

		entrada.close();
	}
}