package Lista_de_Exercícios;

import java.util.Scanner;
import java.util.Stack;

public class L6_Ex2_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner leia = new Scanner(System.in)) {
			Stack<String> pilha = new Stack<String>();
			int op;
			String livro;
			
			do {
			
			System.out.println("\n****************************************************");
			System.out.println("\n                                                    ");
			System.out.println("\n	1 - Adicionar Livros na Pilha                     ");
			System.out.println("\n	2 - Listar todos os Livros                        ");
			System.out.println("\n	3 - Retirar Livros da Pilha                       ");
			System.out.println("\n	0 - Sair                                          ");
			System.out.println("\n                                                    ");
			System.out.println("\n****************************************************");
			System.out.println("\nEntre com a opção desejada: ");
			op = leia.nextInt();
			
			
			if (op != 0) {
				
			switch(op) {
	
			case 1:
				System.out.println("\nDigite o nome do livro que deseja adicionar: ");
				livro = leia.nextLine();
				leia.next();
			pilha.add(livro);
			System.out.println("\nLivro adicionado.");
					break;
			case 2:
				System.out.println("\nLista de livros na pilha: "+pilha);
					break;
			case 3:
				if (pilha.size()==0) {
					System.out.println("\nA pilha já está vazia.");
				}else {
				System.out.println("\nDigite o nome do livro que deseja retirar: ");
				livro = leia.nextLine();
				pilha.remove(livro);
				System.out.println("\nLivro removido.");
				}
					break;
			default:
				System.out.println("\nOpção inválida");
				}
			}
		}while(op != 0);
			
			
		}
		System.out.println("\nVolte sempre!");
	
	}
}

