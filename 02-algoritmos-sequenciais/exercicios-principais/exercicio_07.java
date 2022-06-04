import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite um valor em reais: ");
        	float reais = sc.nextFloat();
        
        	double euros = reais * 0.44;
        
        	System.out.println("R$" + reais + " equivale a €" + euros + " euros");
	}
}
