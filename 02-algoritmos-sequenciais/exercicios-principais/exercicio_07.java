import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float reais;
		double euros;
	    
        System.out.print("Digite um valor em reais: ");
        reais = input.nextFloat();
        
    	euros = reais * 0.44;
        
        System.out.println("R$" + reais + " equivale a €" + euros + " euros");
		
		input.close();
	}
}
