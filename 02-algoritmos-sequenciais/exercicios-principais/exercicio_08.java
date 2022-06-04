import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite um valor em graus celsius: ");
        	int celsius = sc.nextInt();
        
        	float fahrenheit = (celsius * 9 / 5) + 32;
        
        	System.out.print(celsius + "ºC equivale a " + fahrenheit + "ºF");
	}
}
