package Lista_de_Exercícios;

import java.util.Scanner;

public class L3_Ex1_LacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2;
		int x;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nDigite dois números para saber se o intervalo deles é divisível por 3 e 5"
					+ "\nO segundo número NÃO pode ser menor do que o primeiro");
			System.out.println("\n\nPrimeiro número: ");
			n1 = leia.nextFloat();
			System.out.println("\nSegundo número: ");
			n2 = leia.nextFloat();
		}
		if (n1 < n2) {
				for (x=(int) n1;x <= n2;x++) {
					if (x % 3 == 0 && x % 5 == 0) {
			
					System.out.println("\nO número "+x+" é divisível por 3 e 5.");
			}
		}
	
	}else {
		System.out.println("\nIntervalo Inválido.");
	}

}
	
	}