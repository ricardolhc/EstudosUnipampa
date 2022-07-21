import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		float lado_triangulo[][] = new float[5][2];
		float area_triangulo[] = new float[5];
		             
		for(int i = 0; i < lado_triangulo.length; i++) {
		    for(int j = 0; j < lado_triangulo[0].length; j++) {
		        System.out.print("Digite o " + (j + 1) + " lado do triangulo " + (i + 1) + ": ");
		        lado_triangulo[i][j] = entrada.nextFloat();
		    }
		}    
		
		for(int i = 0; i < lado_triangulo.length; i++) {
		    area_triangulo[i] = 1;
		    for(int j = 0; j < lado_triangulo[0].length; j++) {
		        area_triangulo[i] *= lado_triangulo[i][j];
		    }
		    area_triangulo[i] /= 2;
		}
		
		for(int i = 0; i < lado_triangulo.length; i++) {
		    System.out.println("Area do triangulo: " + (i + 1) + ": " + area_triangulo[i]);
		}

	}
}