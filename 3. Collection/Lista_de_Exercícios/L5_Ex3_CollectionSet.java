package Lista_de_Exercícios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class L5_Ex3_CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				try (Scanner read = new Scanner(System.in)) {
					Set<Integer> numeros = new HashSet<Integer>();
					int userChoice, x;
					
					for(x=0;x<10;x++) {
						System.out.println("\nDigite um numero: ");
						userChoice = read.nextInt();
						numeros.add(userChoice);
						
					}
					
					Iterator<Integer> listaNumeros = numeros.iterator();
					
					while(listaNumeros.hasNext()) {
						System.out.println(listaNumeros.next());
					}
				}
			}

		}
	