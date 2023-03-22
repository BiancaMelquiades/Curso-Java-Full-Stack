package Lista_de_Exercícios;

import java.util.Scanner;

public class L2_Ex6_LacoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		String nome;
		float salario,n1,n2,n3,n4,n5,n6,total;
				
		n1 = 10;
		n2 = 7;
		n3 = 9;
		n4 = 6;
		n5 = 5;
		n6 = 8;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nDigite seu salário atual: R$");
		salario = leia.nextFloat();
		
		System.out.println("\n\t\tCARGO");
		System.out.println("\n1- Gerente");
		System.out.println("\n2- Vendedor");
		System.out.println("\n3- Supervisor");
		System.out.println("\n4- Motorista");
		System.out.println("\n5- Estoquita");
		System.out.println("\n6- Técnico de TI");
		System.out.println("\n\nDigite o número do seu cargo informado no menu a cima: ");
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			total = (((n1*salario)/100) + salario);
			System.out.println(nome+" o seu salário foi ajustado de R$"+salario+" para R$"+total);
			break;
		case 2:
			total = (((n2*salario)/100) + salario);
			System.out.println(nome+" o seu salário foi ajustado de R$"+salario+" para R$"+total);
			break;
		case 3:
			total = (((n3*salario)/100) + salario);
			System.out.println(nome+" o seu salário foi ajustado de R$"+salario+" para R$"+total);
			break;
		case 4:
			total = (((n4*salario)/100) + salario);
			System.out.println(nome+" o seu salário foi ajustado de R$"+salario+" para R$"+total);
			break;
		case 5:
			total = (((n5*salario)/100) + salario);
			System.out.println(nome+" o seu salário foi ajustado de R$"+salario+" para R$"+total);
			break;
		default:
			total = (((n6*salario)/100) + salario);
			System.out.println(nome+" o seu salário foi ajustado de R$"+salario+" para R$"+total);
			
			
		}

	}

}
