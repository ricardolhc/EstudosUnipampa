programa
{
	funcao inicio()
	{
		inteiro n1, n2

		escreva("Digite o primeiro numero: ")
		leia(n1)

		escreva("Digite o segundo numero: ")
		leia(n2)

		se (n1 > n2) {
			escreva(n1 ," é maior que ", n2)
		} senao se (n2 > n1) {
			escreva(n2 ," é maior que ", n1)	
		} senao {
			escreva("Os dois numeros sao iguais")
		}
	}
}
