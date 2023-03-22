package Aulas_Introdução_Java;

import java.util.Scanner;

public class a_Hello_World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Bianca Melquiades";
		int idade = 19,x=2;
		double altura = 1.65,n1,n2,n3,m;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSeu nome: "+nome);
		System.out.println("\nSua idade: "+idade+" anos");
		System.out.println("\nSua altura: "+altura+"m");
		
		System.out.println("\nDigite as notas abaixo:\n\nNota1: ");
		n1 = leia.nextDouble();
		System.out.println("\nNota 2: ");
		n2 = leia.nextDouble();
		System.out.println("\nNota 3: ");
		n3 = leia.nextDouble();
		
		m = (n1+n2+n3)/3;
		
		System.out.println("\nMédia: "+m);
		System.out.printf("\nMédia: %.2f",m);
		
		n1 = Math.sqrt(n2);
		n2 = Math.pow(n3,3);
		x = idade % x;
		
		
	}

}
