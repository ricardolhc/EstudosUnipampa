import java.util.Scanner;

public class Main {
    
    public static void main(String [] args) {

        int quantidadeTotal = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos que deseja cadastrar: ");
        quantidadeTotal = input.nextInt();
        input.nextLine();

        Produto[] estoque = new Produto[quantidadeTotal];

        for(int i = 0; i < estoque.length; i++) {
            System.out.print("Digite o nome do produto: ");
            estoque[i] = new Produto(input.nextLine());

            System.out.print("Digite a quantidade do produto: ");
            estoque[i].setQuantidade(input.nextInt());
            input.nextLine();

            System.out.print("Digite o preco do produto: ");
            estoque[i].setPreco(input.nextFloat());
            input.nextLine();
        }

        for(int i = 0; i < estoque.length; i++) {
            System.out.println(i + " " + estoque[i].mostraProduto());
        }

        input.close();
        
    }
}
