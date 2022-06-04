programa
{
	funcao inicio()
	{
		inteiro peso_vaca_kg
		inteiro peso_vaca_gr

		escreva("Digite o peso da vaca em kg: ")
		leia(peso_vaca_kg)

		peso_vaca_gr = peso_vaca_kg * 1000

		escreva("O peso da vaca em gramas é: ", peso_vaca_gr)
		escreva("\nSe a vaca engordar 50%, o peso dela, em gramas, será de: ", peso_vaca_gr + ((peso_vaca_gr * 5) / 10))
	}
}
