package Aulas_Introdução_Java;

import java.util.Scanner;

public class d_array_vetor {

	public static void main(String[] args) {

		// para instanciar, utilizamos "new"
		//[] = dimensão //[] [] = bi dimensional // [] [] [] tri dimensional
		//a posição inicial de um vetor ou matriz é zero (0)
		
		float [] media = new float [3];
		float n1,n2,n3,somaMedia=0,mediaGeral;
		int x;
		
		Scanner leia =new Scanner(System.in);
		
		for(x=0;x<3;x++) {
			System.out.println("\nEntre com a 1ª nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a 2ª nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a 3ª nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			System.out.println("\nSua média foi de: "+media[x]);
			somaMedia += media[x];
			if(media[x]>=7 && media[x]<=10) {
				System.out.println("\nAlune Aprovado(a).");
			}else if(media[x]>=5 && media[x]<7) {
				System.out.println("\nAlune de Exame.");
			}else {
				System.out.println("\nAlune Reprovado(a).");
			}
		}
		mediaGeral = somaMedia / 3;
		System.out.printf("\nMédia Geral: %.2f"+mediaGeral);
		
		for(x=0;x<3;x++) {
			System.out.println("\nMédia do aluno(a) "+(x+1)+" : "+media[x]);
		}

	}

}
