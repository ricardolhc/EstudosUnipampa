import java.util.Scanner;

public class Exercicio_15 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int estoque[][] = new int[4][3];
		float custo[] = new float[3];

		int armazemMaiorQuantidadeProduto2 = 0;
		
		for(int i = 0; i < custo.length; i++) {
		    System.out.print("Digite o custo do produto " + (i + 1) + ": ");
		    custo[i] = input.nextFloat();
		}
		
		System.out.println();
		
		for(int i = 0; i < estoque.length; i++) {
		    System.out.println("Armazém " + (i + 1));
		    for(int j = 0; j < estoque[0].length; j++) {
		        System.out.print("Digite a quantidade de produtos do produto " + (j + 1) + ": ");
		        estoque[i][j] = input.nextInt();
		    }
		}
		
		int maiorQuantidadeProduto2 = estoque[0][1];
		System.out.println();
		
		for(int i = 0; i < estoque.length; i++) {
		    int quantidadeProduto = 0;

		    for(int j = 0; j < estoque[0].length; j++) {
		        quantidadeProduto += estoque[i][j];
		    }
		    System.out.println("Quantidade de produtos no armazém " + (i + 1) + ": " + quantidadeProduto);
		}
		
		System.out.println();
		
		for(int i = 0; i < estoque.length; i++) {
		    if(maiorQuantidadeProduto2 < estoque[i][1]) {
		        maiorQuantidadeProduto2 = estoque[i][1];
		        armazemMaiorQuantidadeProduto2 = i;
		    }
		}
		
		System.out.println("Armazém com a maior quantidade de produto 2: " + (armazemMaiorQuantidadeProduto2 + 1));
		System.out.println();
		
		for(int i = 0; i < estoque.length; i++) {
		    System.out.println("Armazém " + (i + 1));
		    for(int j = 0; j < estoque[0].length; j++) {
		        float custoProduto = estoque[i][j] * custo[j];
		        System.out.println("Custo total do produto " + (j + 1) + ": " + custoProduto);
		    }
		}
		
		System.out.println();
		
		for(int i = 0; i < estoque[0].length; i++) {
		    float custoProduto = 0;
		    for(int j = 0; j < estoque.length; j++) {
		        custoProduto += estoque[j][i] * custo[i];
		    }
		    System.out.println("Custo total do produto " + (i + 1) + " em todos os armazens: " + custoProduto);
		}
		
		System.out.println();
		
		for(int i = 0; i < estoque.length; i++) {
		    float custoProduto = 0;
		    for(int j = 0; j < estoque[0].length; j++) {
		        custoProduto += estoque[i][j] * custo[j];
		    }
		    System.out.println("Custo total do armazém " + (i + 1) + ": " + custoProduto);
		}
		
		input.close();
	}
}