programa
{
	
	funcao inicio()
	{
		inteiro n1,n2,n3
		
		escreva("Insira os números abaixo separadamente\nNúmero 1:")
		leia(n1)
		escreva("Número 2:")
		leia(n2)
		escreva("Número 3:")
		leia(n3)
		
		
		se ((n1>n2) e (n1>n3)){
			limpa()
			escreva ("Resultado:\n\nO número ", n1 ," é o maior número da sequência\n")
		}senao se ((n2>n1) e (n2>n3)){
			limpa()
			escreva ("Resultado:\n\nO número ", n2 ," é o maior número da sequência\n")
		}senao se ((n3>n1) e (n3>n2)){
			limpa()
			escreva ("Resultado:\n\nO número ", n3 ," é o maior número da sequência\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 202; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */