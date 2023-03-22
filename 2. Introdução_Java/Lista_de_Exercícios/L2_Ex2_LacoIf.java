package Lista_de_Exercícios;

import java.util.Scanner;

public class L2_Ex2_LacoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o número: ");
		num = leia.nextInt();
		
		if(num >= 0 && num %.2 == 0) {
			System.out.println("\n O número "+num+" é par e positivo");
		}else if(num <= 0 && num %.2 == 0) {
			System.out.println("\n O número "+num+" é par e negativo");
		}else if(num >= 0 && num %.2 != 0) {
			System.out.println("\n O número "+num+" é impar e positivo");
		}else {
			System.out.println("\n O número "+num+" é impar e negativo");
		}
		
	}

}
