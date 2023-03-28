package Lista_de_Exercícios;

import java.util.ArrayList;
import java.util.Scanner;

public class L5_Ex1_CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner read = new Scanner(System.in);
				
				ArrayList<String> cores = new ArrayList<String>();
				
				
				for(int i=0;i<5;i++) {
				System.out.println("\nDigite uma cor: ");
				String cor = read.nextLine();
				cores.add(cor);
				
				}
				System.out.println("\nSua lista de cores: ");	
					System.out.println(cores);
					
				cores.sort(null);
				System.out.println("\nSua lista de cores em ordem alfabetica: ");
					System.out.println(cores);
				}
			
			}
