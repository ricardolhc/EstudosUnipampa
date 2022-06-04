programa
{
	funcao inicio()
	{
		inteiro pessoas

		escreva("Digite o numero de pessoas: ")
		leia(pessoas)

		se (pessoas < 5000) {
			escreva("Público Fraco")
		} senao se ((pessoas >= 5000) e (pessoas <= 20000)) {
			escreva("Público Bom")
		} senao {
			escreva("Público Excelente")
		}
	}
}
