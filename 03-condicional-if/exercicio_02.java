import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("N1 = ");
		float n1 = entrada.nextFloat();
		
		System.out.print("N2 = ");
		float n2 = entrada.nextFloat();
		
		System.out.print("N3 = ");
		float n3 = entrada.nextFloat();
		
		float media = (n1 + n2 + n3) / 3;
		
		if(media >= 6) {
		    System.out.print("Media = ");
		    System.out.format("%.2f", media);
		    System.out.print(" : Aprovado");
		} else {
		    System.out.print("Media = ");
		    System.out.format("%.2f", media);
		    System.out.print(" : Reprovado");
		}
		
	}
}
