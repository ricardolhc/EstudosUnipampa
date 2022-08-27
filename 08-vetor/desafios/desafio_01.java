import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int senha[] = new int[10];
		
        for(int i = 0; i < senha.length; i++) {
            
            boolean repetido;
            
            do {
                
                repetido = false;
                
                System.out.print("Digite um numero: ");
                senha[i] = entrada.nextInt();
                
                for(int j = 0; j < senha.length; j++) {
                    if(senha[i] == senha[j] && i != j) {
                        System.out.println("Numero invalido");
                        repetido = true;
                    }
                }
                
            } while(repetido == true);
            
        }
        
        for(int i = 0; i < 10; i++) {
            System.out.print(senha[i]);
        }

        entrada.close();

	}
}