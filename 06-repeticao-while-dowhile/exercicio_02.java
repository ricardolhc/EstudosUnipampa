public class Exercicio_02 {
    public static void main(String[] args) {
		
        int i = 1;
        int soma = 0;
        int produto = 1;
        
        while(i <= 10) {
            soma += i;
            produto *= i;
            i++;
        }
        
        System.out.println("A soma é: " + soma);
        System.out.println("O produto é: " + produto);
    }
}
