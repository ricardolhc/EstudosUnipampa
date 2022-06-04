programa
{
	funcao inicio(){
		real a, b, c

		escreva("Digite o primeiro numero: ")
		leia(a)

		escreva("Digite o segundo numero: ")
		leia(b)

		escreva("Digite o terceiro numero: ")
		leia(c)
 
		se ((a + b) > c) {
			escreva("A soma de ", a ," + ", b ," é maior do que ", c)
		} senao se (c > (a + b)) {
			escreva(c ," é maior do que a soma de ", a ," + ", b)
		} senao {
			escreva("A soma de ", a ," + ", b ," é exatamente igual a ", c)
		}
	}
}
