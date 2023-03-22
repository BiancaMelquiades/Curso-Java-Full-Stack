package Lista_de_Exercícios;

import java.util.Scanner;

public class L2_Ex3_LacoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;
		boolean doou;
		
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite as informações do paciente para a avaliar se está apto a doar sangue");
			System.out.println("\nNome: ");
			nome = leia.nextLine();
			System.out.println("\nIdade: ");
			idade = leia.nextInt();
			
			if (idade >= 18 && idade <=59) {
				System.out.println(nome+" está apto(a) para doar sangue.");
			}else if (idade >= 60 && idade <=69 ) {
					System.out.println("\nPrimeira doação? (true ou false): ");
					doou = leia.nextBoolean();
					if (doou == false ) {
						System.out.println(nome+" está apto(a) para doar sangue.");
					}else {
						System.out.println(nome+" não está apto para doar sangue");
					}
				
			}else {
				System.out.println(nome+" não está apto para doar sangue");
			}
		}
	}


