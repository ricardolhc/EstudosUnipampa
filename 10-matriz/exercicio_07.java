import java.util.Scanner;

public class Exercicio_07 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		float ladoTriangulo[][] = new float[5][2];
		float areaTriangulo[] = new float[5];
		             
		for(int i = 0; i < ladoTriangulo.length; i++) {
		    for(int j = 0; j < ladoTriangulo[0].length; j++) {
		        System.out.print("Digite o " + (j + 1) + " lado do triangulo " + (i + 1) + ": ");
		        ladoTriangulo[i][j] = input.nextFloat();
		    }
		}    
		
		for(int i = 0; i < ladoTriangulo.length; i++) {
		    areaTriangulo[i] = 1;
		    for(int j = 0; j < ladoTriangulo[0].length; j++) {
		        areaTriangulo[i] *= ladoTriangulo[i][j];
		    }
		    areaTriangulo[i] /= 2;
		}
		
		for(int i = 0; i < ladoTriangulo.length; i++) {
		    System.out.println("Area do triangulo: " + (i + 1) + ": " + areaTriangulo[i]);
		}

		input.close();
	}
}