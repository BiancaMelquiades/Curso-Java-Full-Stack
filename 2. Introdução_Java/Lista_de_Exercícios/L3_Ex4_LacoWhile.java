package Lista_de_Exercícios;

import java.util.Scanner;

public class L3_Ex4_LacoWhile {

		public static void main(String[] args) {
			
			int idade, sexo, categoria,n1 = 0,n2=0,n3=0,n4=0;
			char continuar;
			
			
			Scanner leia = new Scanner(System.in);
			
			
			
			
			System.out.println("\nCadastrar colaboradore? \n(S/N)");
			continuar = leia.next().charAt(0);
			
			while (continuar == 'S') {
				System.out.println("Entre com a idade: ");
				idade = leia.nextInt();
				System.out.println("\nEntre com o número referente ao sexo: \n1 - Masculino\n2 - Feminino\n3 - Outros");
				sexo = leia.nextInt();
				System.out.println("\nEntre com o número referente à categoria: \n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack");
				categoria = leia.nextInt();
				System.out.println("\nDeseja adicionar mais um calaboradore? (S/N)");
				continuar = leia.next().charAt(0);
				
				if(categoria == 1) {
					
					n1++;
					
				}else if (sexo == 2 && categoria == 2) {
					n2++;
					
				}else if (sexo == 1 && categoria == 3 && idade > 40) {
					n3++;
					
				}else if (sexo == 2 && categoria == 4 && idade < 30) {
					n4++;
				}	
			
				
			} 
			
			System.out.println(n1+" pessoas desenvolvedoras Backend");
			System.out.println(n2+" mulheres desenvolvedoras Frontend");
			System.out.println(n3+" homens desenvolvedores Mobile maiores de 40 anos");
			System.out.println(n4+" mulheres desenvolvedoras FullStack menores de 30 anos");

		}

	}