programa
{
	funcao inicio()
	{
		inteiro nota

		escreva("Digite uma nota de 0 até 10: ")
		leia(nota)

		se ((nota < 0) ou (nota > 10)) {
			escreva("Nota inválida!")
		} senao se (nota >= 6) {
			escreva("Aprovado!")
		} senao {
			escreva("Reprovado!")
		}
	}
}
