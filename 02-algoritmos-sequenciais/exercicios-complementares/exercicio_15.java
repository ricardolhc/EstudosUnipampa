import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite o peso da vaca em kg: ");
        	int peso_vaca_kg = sc.nextInt();
        	
        	int peso_vaca_gr = peso_vaca_kg * 1000;
        	
        	System.out.println("O peso da vaca em gramas é: " + peso_vaca_gr);
        	System.out.print("Se a vaca engordar 50%, o peso dela, em gramas, será de: " + (peso_vaca_gr + ((peso_vaca_gr * 5) / 10)));
	}
}
