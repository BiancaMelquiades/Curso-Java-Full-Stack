programa
{
	funcao inicio()
	{
		cadeia pais
		inteiro idade
		logico permitido
		escreva("Country/país? (BRA, USA, POR)\n")
		leia(pais)
		limpa()
		escreva("Qual a idade?")
		leia(idade)
		limpa()
		se(pais=="BRA" e idade >= 18){
			permitido=verdadeiro
		}senao se(pais=="USA" e idade >= 21){
			permitido=verdadeiro
		}senao se(pais=="POR"){
			permitido=verdadeiro
		}senao{
			permitido=falso
		}
	}
}	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 64; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */