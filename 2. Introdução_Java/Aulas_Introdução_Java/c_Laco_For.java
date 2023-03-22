package Aulas_Introdução_Java;

import java.util.Scanner;

public class c_Laco_For {

	public static void main(String[] args) {
		
		float n1,n2,n3,media,somaMedia=0,mediaGeral;
		int x; //(variavel de looping)
		String nome;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=3;x++) { // x++ = x+1 ---- Estrutura "for": Inicio, Fim, Como
			System.out.println("\nEntre com o nome do alune: ");
			nome = leia.nextLine();
			leia.nextLine();
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			media = (n1+n2+n3)/3;
			somaMedia += media; //somaMedia = somaMedia + media
			System.out.println("\nA média de "+nome+" foi de: "+media);
			
		mediaGeral = somaMedia / 3;
		System.out.printf("\nMédia Geral da turma foi de: %.2f",mediaGeral);
			
		}
			
	}

}
