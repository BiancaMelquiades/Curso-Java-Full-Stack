package Lista_de_Exercícios;

import java.util.Scanner;

public class L1_Ex1_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario,abono,total;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite seu abono: ");
		abono = leia.nextFloat();
		
		total = salario + abono;
		
		System.out.println("\nValor total: "+total);

	}

}
