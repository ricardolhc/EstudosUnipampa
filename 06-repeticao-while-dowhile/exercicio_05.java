import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float media = 0;
		float n1, n2, n3;
		
		do {
		        System.out.print("Informe n1: ");
		        n1 = entrada.nextFloat();
		        if(!(n1 >= 0 && n1 <= 10)) {
		                System.out.print("Nota invalida. ");
		        }
	        } while(!(n1 >= 0 && n1 <= 10));
		
		do {
		        System.out.print("Informe n2: ");
		        n2 = entrada.nextFloat();
		        if(!(n2 >= 0 && n2 <= 10)) {
		                System.out.print("Nota invalida. ");
		        }
		} while(!(n2 >= 0 && n2 <= 10));
		
		do {
		        System.out.print("Informe n3: ");
		        n3 = entrada.nextFloat();
		        if(!(n3 >= 0 && n3 <= 10)) {
		                System.out.print("Nota invalida. ");
		        }
		} while(!(n3 >= 0 && n3 <= 10));
		
		
		media = (2 * n1 + 3 * n2 + 5 * n3) / 10;
		
		System.out.print("Sua media é: ");
		System.out.format("%.2f", media);
	}
}
