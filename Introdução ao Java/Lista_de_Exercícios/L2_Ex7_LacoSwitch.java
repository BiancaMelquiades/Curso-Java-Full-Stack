package Lista_de_Exercícios;

import java.util.Scanner;

public class L2_Ex7_LacoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1,num2,total;
		int op = 0;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\n\t\tCALCULADORA");
			System.out.println("\n\nDigite o 1º número: ");
			num1 = leia.nextFloat();
			System.out.println("\nDigite o 2º número: ");
			num2 = leia.nextFloat();
			System.out.println("\n\t\tOPERAÇÃO");
			System.out.println("\n1- Soma");
			System.out.println("\n2- Subtração");
			System.out.println("\n3- Multiplicação");
			System.out.println("\n4- Divisão");
			System.out.println("\nEscolha o número da operação desejada: ");
			op = leia.nextInt();
		}
		
		switch (op) {
		
		case 1:
			total = num1 + num2;
			System.out.println("\n\n"+num1+" + "+num2+" = "+total);
			break;
		case 2:
			total = num1 - num2;
			System.out.println("\n\n"+num1+" - "+num2+" = "+total);
			break;
		case 3:
			total = num1 * num2;
			System.out.println("\n\n"+num1+" * "+num2+" = "+total);
			break;
		default:
			total = num1 / num2;
			System.out.println("\n\n"+num1+" / "+num2+" = "+total);
			break;
		}
		

	}

}