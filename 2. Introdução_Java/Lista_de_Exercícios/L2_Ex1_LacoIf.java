package Lista_de_Exercícios;

import java.util.Scanner;

public class L2_Ex1_LacoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		num1 = (int) leia.nextFloat();
		System.out.println("\nDigite o segundo número: ");
		num2 = (int) leia.nextFloat();
		
		if(num1>num2) {
			System.out.println("O número "+num1+" é maior que o número "+num2);
		}else if(num1<num2) {
			System.out.println("O número "+num1+" é menor que o número "+num2);
		}else {
			System.out.println("O número "+num1+" é igual que o número "+num2);
		}
		
	}
		
}


