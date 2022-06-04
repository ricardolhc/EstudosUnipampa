programa
{
	funcao inicio()
	{
		real n1, n2
		caracter simbolo
		
		escreva("Digite o primeiro numero: ")
		leia(n1)

		escreva("Digite o segundo numero: ")
		leia(n2)

		escreva("Digite + para somar ou digite - para subtrair: ")
		leia(simbolo)

		escolha(simbolo) {
			caso '+': 
				escreva("A soma de ", n1 ," + ", n2 ," é: ", n1 + n2)
			pare
				
			caso '-':
				escreva("A subtracao de ", n1 ," - ", n2 ," é: ", n1 - n2)
			pare

			caso contrario: 
				escreva("Digite um simbolo valido!")
		}
	}
}
