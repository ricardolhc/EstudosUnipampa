programa
{
	funcao inicio()
	{
		real n1, n2

		escreva("Digite o primeiro numero: ")
		leia(n1)

		escreva("Digite o segundo numero: ")
		leia(n2)

		se ((n1 * 2) == n2 ou (n2 * 2) == n1) {
			escreva("OK!")
		} senao {
			escreva("NÃO!")
		}
	}
}
