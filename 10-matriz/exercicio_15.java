import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int estoque[][] = new int[4][3];
		float custo[] = new float[3];
		
		for(int i = 0; i < custo.length; i++) {
		    System.out.print("Digite o custo do produto " + (i + 1) + ": ");
		    custo[i] = entrada.nextFloat();
		}
		
		System.out.println();
		
		for(int i = 0; i < estoque.length; i++) {
		    System.out.println("Armazém " + (i + 1));
		    for(int j = 0; j < estoque[0].length; j++) {
		        System.out.print("Digite a quantidade de produtos do produto " + (j + 1) + ": ");
		        estoque[i][j] = entrada.nextInt();
		    }
		}
		
		System.out.println();
		
		for(int i = 0; i < estoque.length; i++) {
		    int quantidade_produto = 0;
		    for(int j = 0; j < estoque[0].length; j++) {
		        quantidade_produto += estoque[i][j];
		    }
		    System.out.println("Quantidade de produtos no armazém " + (i + 1) + ": " + quantidade_produto);
		}
		
		System.out.println();
		
		int maior_quantidade_produto2 = estoque[0][1];
		int armazem_maior_quantidade_produto2 = 0;
		for(int i = 0; i < estoque.length; i++) {
		    if(maior_quantidade_produto2 < estoque[i][1]) {
		        maior_quantidade_produto2 = estoque[i][1];
		        armazem_maior_quantidade_produto2 = i;
		    }
		}
		
		System.out.println("Armazém com a maior quantidade de produto 2: " + (armazem_maior_quantidade_produto2 + 1));
		System.out.println();
		
		for(int i = 0; i < estoque.length; i++) {
		    System.out.println("Armazém " + (i + 1));
		    for(int j = 0; j < estoque[0].length; j++) {
		        float custo_produto = estoque[i][j] * custo[j];
		        System.out.println("Custo total do produto " + (j + 1) + ": " + custo_produto);
		    }
		}
		
		System.out.println();
		
		for(int i = 0; i < estoque[0].length; i++) {
		    float custo_produto = 0;
		    for(int j = 0; j < estoque.length; j++) {
		        custo_produto += estoque[j][i] * custo[i];
		    }
		    System.out.println("Custo total do produto " + (i + 1) + " em todos os armazens: " + custo_produto);
		}
		
		System.out.println();
		
		for(int i = 0; i < estoque.length; i++) {
		    float custo_produto = 0;
		    for(int j = 0; j < estoque[0].length; j++) {
		        custo_produto += estoque[i][j] * custo[j];
		    }
		    System.out.println("Custo total do armazém " + (i + 1) + ": " + custo_produto);
		}
		
		
	}
}