package Lista_de_Exercícios;

import java.util.Scanner;

public class L3_Ex5_LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,total=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um número para somar e zero (0) para sair: ");
			num = leia.nextInt();
			
			if (num > 0) {
			total += num;
			
			}
			
		} while (num != 0);
				
		System.out.println("\nA soma dos números positivos é: "+total);
	}

}
