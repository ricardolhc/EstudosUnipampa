import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
	float valor;
	double desconto;
		
        do {
            
            System.out.print("Digite o valor da compra à vista: ");
            valor = input.nextFloat();
            
            if(valor > 0) {
                desconto = valor * 0.9;
                System.out.println("O valor com desconto é: " + desconto);
            }
            
        } while(valor > 0);

        input.close();
    }
}
