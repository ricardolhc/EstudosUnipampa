programa
{
	funcao inicio()
	{
		real a, b, c
		real media

		escreva("Digite o primeiro numero: ")
		leia(a)

		escreva("Digite o segundo numero: ")
		leia(b)

		escreva("Digite o terceiro numero: ")
		leia(c)

		se ((a > b) e (a > c)) { 
			media = (b + c) / 2
			escreva("A media de ", b ," e ", c ," é: ", media)
		} senao se ((b > a) e (b > c)) {
			media = (a + c) / 2
			escreva("A media de ", a ," e ", c ," é: ", media)
		} senao {
			media = (a + b) / 2
			escreva("A media de ", a ," e ", b ," é: ", media)
		}
	}
}
