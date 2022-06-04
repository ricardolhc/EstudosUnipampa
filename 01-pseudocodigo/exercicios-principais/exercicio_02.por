programa
{
	funcao inicio()
	{
		real n1, n2
		real soma

		real n3, n4, n5
		real media

		real produto

		escreva("Digite o primeiro numero: ")
		leia(n1)

		escreva("Digite o segundo numero: ")
		leia(n2)

		soma = n1 + n2

		escreva("Digite o terceiro numero: ")
		leia(n3)

		escreva("Digite o quarto numero: ")
		leia(n4)
		
		escreva("Digite o quinto numero: ")
		leia(n5)

		media = (n3 + n4 + n5) / 3

		produto = media * soma

		escreva("O produto entre ", media ," e ", soma ," é: ", produto)	
	}
}
