package Lista_de_Exercícios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class L5_Ex4_ColloctionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> setNumeros = new HashSet<Integer>();
		Scanner scanner = new Scanner(System.in);
		Integer valor;
	
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		 System.out.print("\nDigite o número que você deseja encontrar: ");
         valor = scanner.nextInt();
     
         if (setNumeros.contains(valor) == true) {
        	 System.out.print("\nO número "+valor+" foi encontrado! "); 
         } else {
        System.out.print("\nO número "+valor+" não foi encontrado! ");
         }
				
		
	}

}