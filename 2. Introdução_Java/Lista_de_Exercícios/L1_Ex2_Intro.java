package Lista_de_Exercícios;

import java.util.Scanner;

public class L1_Ex2_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,n4,media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira a nota 1: ");
		n1 = leia.nextFloat();
		System.out.println("\nInsira a nota 2: ");
		n2 = leia.nextFloat();
		System.out.println("\nInsira a nota 3: ");
		n3 = leia.nextFloat();
		System.out.println("\nInsira a nota 4: ");
		n4 = leia.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("Média: "+media);
		
		

	}

}
