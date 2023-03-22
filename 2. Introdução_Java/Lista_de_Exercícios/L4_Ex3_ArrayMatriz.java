package Lista_de_Exercícios;

import java.util.Scanner;


public class L4_Ex3_ArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int [][] matriz =  new int[3][3];
				int linha,coluna,somaDiagonalPrinc=0,somaDiagonalSec=0;
				
				Scanner leia = new Scanner(System.in);
				
				for(linha=0;linha<3;linha++) {
					for(coluna=0;coluna<3;coluna++) {
						System.out.println("Digite um número: ");
						matriz[linha][coluna]=leia.nextInt();
						somaDiagonalPrinc += matriz[linha][coluna];
						somaDiagonalSec += matriz[coluna][linha];
					}if(linha==coluna) {
						somaDiagonalPrinc += matriz[linha][coluna];
						somaDiagonalSec += matriz[coluna][linha];
					}
					}
				System.out.println("Soma matriz principal:  "+somaDiagonalPrinc);
				System.out.println("Soma matriz secundária:  "+somaDiagonalSec);
			}
		}