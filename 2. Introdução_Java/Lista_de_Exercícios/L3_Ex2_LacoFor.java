package Lista_de_Exercícios;

import java.util.Scanner;

public class L3_Ex2_LacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num = 0,x,impar=0,par=0;
	
	try (Scanner leia = new Scanner(System.in)) {
		for(x=1;x<=10;x++) {
			System.out.println("\nDigite o "+x+"º número: ");
			num = leia.nextInt();	
		
			if (num % 2 == 0) {
				par++;
				
			}else {
				impar++;
				
			}
			
		}
	}
	
		System.out.println("\nTotal de números ímpares: "+impar);
		System.out.println("\nTotal de números pares: "+par);
		
	}

}
