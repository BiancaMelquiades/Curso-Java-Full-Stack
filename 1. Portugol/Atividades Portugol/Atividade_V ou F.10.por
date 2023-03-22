programa {
	
  funcao inicio(){
    
    inteiro x,y,z
    
    y=4
    z=9

    escreva ("Esse número é divisível por 4 ou 9? Insira um número e descubra!\n\n")
    leia(x)

    se(x%y==0){
      limpa()
      escreva("VERDADEIRO. O número ",x," é divisível por 4.\n\n")

    }senao se(x%z==0){
      limpa()
      escreva("VERDADEIRO. O número ",x," é divisível por 9.\n\n")

    }senao{
      limpa()
      escreva("FALSO. O número ",x," NÃO é divisível por 4 ou 9\n\n")
    }


 			 }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */