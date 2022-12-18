public class Exercicio_03 {
    
	public static void main(String[] args) {
	    
		int soma = 0;
		int produto = 1;
	   
		for(int i = 1; i <= 10; i++) {
	        soma += i;
	        produto *= i;
	    }
	   
	    System.out.println("A soma é: " + soma);
	    System.out.println("O produto é: " + produto);
	   
	}
}
