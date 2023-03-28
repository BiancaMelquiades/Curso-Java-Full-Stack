package Lista_de_Exercícios;

import java.util.ArrayList;
import java.util.Scanner;

public class L5_Ex2_CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ArrayList<Integer> numeros = new ArrayList<Integer>();
				Scanner scanner = new Scanner(System.in);
				Integer num;
	
				
						numeros.add(2);
						numeros.add(5);
						numeros.add(1);
						numeros.add(3);
						numeros.add(4);
						numeros.add(9);
						numeros.add(7);
						numeros.add(8);
						numeros.add(10);
						numeros.add(6);
						
				
						System.out.print("\nDigite o número que você deseja encontrar: ");
						num = scanner.nextInt();
						
	
						 if (numeros.contains(num) == true) {
				        	 System.out.print("\nO número "+num+" está localizado na posição: "+numeros.indexOf(num)); 
				         } else {
				        System.out.print("\nO número "+num+" não foi encontrado! ");
				         }
						
						
			}

		}