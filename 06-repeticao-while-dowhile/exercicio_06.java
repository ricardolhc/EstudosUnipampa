import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char escolha;
	        float saldo = 0;
		
		do {
		    
		        System.out.println("\n(a) consulta saldo");
		        System.out.println("(b) saque");
		        System.out.println("(c) deposito");
		        System.out.println("(d) sair");
		        System.out.print("Opção: ");
		        escolha = entrada.next().charAt(0);
		    
		        switch(escolha) {
		        
		                case 'a': case 'A':
		                        System.out.println("Saldo: R$" + saldo);
		                        break;
		            
		                case 'b': case 'B':
		                        System.out.print("Valor: ");
		                        float saque = entrada.nextFloat();
					if(saque > 0) {
						if(!(saque > saldo)) {
							saldo -= saque;
						} else {
							System.out.println("ERRO: O saque é maior do que o saldo!");
						}
					} else {
						System.out.println("Saque não pode ser zero ou negativo!");
					}
		                        break;
		           
		                case 'c': case 'C':
		                        System.out.print("Valor: ");
		                        float deposito = entrada.nextFloat();
					if(deposito <= 0) {
		                            System.out.println("Depósito não pode ser zero ou negativo!");
		                        } else {
		                            saldo += deposito;  
		                        }
		                        break;
		           
		                case 'd': case 'D':
		                        break;
		           
		                default:
		                        System.out.println("Opção inválida!");
		                        break;
		        }
		    
		} while (escolha != 'd' && escolha != 'D');
	}
}
