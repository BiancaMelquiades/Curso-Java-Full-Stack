package Lista_de_Exercícios;

import java.util.Scanner;

public class L3_Ex6_LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				int num,somaNum = 0,cont = 0;
				float media;
				
				try (Scanner leia = new Scanner(System.in)) {
					do {
						System.out.println("Digite um número: ");
						num = leia.nextInt();
						if (num % 3 == 0) {
							somaNum += num;
							cont++;
						}
						
					}while (num !=0 );
				}
				
				media = somaNum/cont;
				System.out.println("A média de todos os números múltiplos de 3 é : "+media);
				
			}

		}