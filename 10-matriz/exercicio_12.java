import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		float n[][] = new float[12][4];
		             
		for(int i = 0; i < n.length; i++) {
            System.out.println("Mês " + (i + 1));
		    for(int j = 0; j < n[0].length; j++) {
		        System.out.print("Digite o valor da venda da semana " + (j + 1) + ": ");
		        n[i][j] = entrada.nextFloat();
		    }
		}

        System.out.println();

        for(int i = 0; i < n.length; i++) {
            float venda_mes = 0;
            for(int j = 0; j < n[0].length; j++) {
                venda_mes += n[i][j];
            }
            System.out.println("Venda do mês " + (i + 1) + ": " + venda_mes);
        }

        System.out.println();

		for(int i = 0; i < n[0].length; i++) {
            float venda_semana = 0;
            for(int j = 0; j < n.length; j++) {
                venda_semana += n[j][i];
            }
            System.out.println("Venda da semana " + (i + 1) + ": " + venda_semana);
        }

        System.out.println();

        float venda_ano = 0;

        for(int i = 0; i < n.length; i++) {
            for(int j = 0; j < n[0].length; j++) {
                venda_ano += n[i][j];
            }
        }

        System.out.print("Total das vendas do ano: " + venda_ano);

		entrada.close();
	}
}