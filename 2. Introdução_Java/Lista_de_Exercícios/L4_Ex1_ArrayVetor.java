package Lista_de_Exercícios;

import java.util.Scanner;

public class L4_Ex1_ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				int[] num = new int[10] ;
				int numero,encontrado,x,cont=0;
				
				Scanner leia = new Scanner(System.in);
				//Esse for vai entrar com valores para cada posição do meu ARRAY
				for(x=0;x<10;x++) {
					System.out.println("\nEntre com um número do Array: ");
					num[x] = leia.nextInt();
					
				}
				//Agora vou pedir para o usuário digitar um número qualquer
				System.out.println("\nDigite um número: ");
				numero = leia.nextInt();
				
				//vamos fazer a verificação do valor digitado com os valores do Vetor
				for(x=0;x<10;x++) {
					
					if(num[x] == numero) {
						System.out.println("\nA posição do número digitado é: "+x);
						cont++;
					}
				}
				
				if(cont == 0) {
					System.out.println("\nNão foi encontrado");
				}

			}

		}
