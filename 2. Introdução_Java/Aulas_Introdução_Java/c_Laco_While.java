package Aulas_Introdução_Java;

import java.util.Scanner;

public class c_Laco_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,somaPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntrer com um número: ");
		numero = leia.nextInt();
		
		while(numero != 0) {
			
			if(numero % 2 == 0) {
				somaPar += numero;
			}else {
				contImpar++;
			}
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
		}
		
		System.out.println("\nSomatório dos números pares foi de: "+somaPar);
		System.out.println("\nQuantidade de números ímpares foi de: "+contImpar);
		
		
	}

}
