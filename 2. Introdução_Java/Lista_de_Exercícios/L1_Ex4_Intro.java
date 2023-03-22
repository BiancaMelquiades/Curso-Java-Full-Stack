package Lista_de_Exercícios;

import java.util.Scanner;

public class L1_Ex4_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,n4,total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("\nInsira o segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("\nInsira o terceiro número: ");
		n3 = leia.nextFloat();
		System.out.println("\nInsira o quarto número: ");
		n4 = leia.nextFloat();
		
		total = (n1*n2)-(n3*n4);
		
		System.out.println("\n\nTotal: "+total);

	}

}
