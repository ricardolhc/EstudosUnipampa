programa
{
	funcao inicio()
	{
		inteiro idade

		escreva("Digite uma idade: ")
		leia(idade)

		se (idade < 16) {
			escreva("Não pode votar")
		} senao se ((idade == 16) ou (idade == 17) ou (idade > 70)) {
			escreva("Foto facultativo")
		} senao {
			escreva("Voto obrigatório")
		}
	}
}
