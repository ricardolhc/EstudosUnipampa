import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String times[] = new String[5];
		
		for(int i = 0; i < times.length; i++) {
		    System.out.print("Digite o " + i + " time: ");
		    times[i] = entrada.nextLine();
		}
		
		for(int i = 0; i < times.length; i++) {
		    for(int j = 0; j < times.length; j++) {
		        if(j != i && j > i) {
		            System.out.println(times[i] + " X " + times[j]);
		        }
		    }
		}

		entrada.close();

	}
}