import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite os segundos: ");
        	int segundos = sc.nextInt();
        
        	int minutos = 0;
        	int horas = 0;
        
        	horas = segundos / 3600;
		segundos %= 3600;
		minutos = segundos / 60;
		segundos %= 60;
		
        	System.out.print(horas + "h:" + minutos + "m:" + segundos + "s");
	}
}
