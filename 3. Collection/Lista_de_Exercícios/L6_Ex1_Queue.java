package Lista_de_Exercícios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class L6_Ex1_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner leia = new Scanner(System.in)) {
			Queue<String> fila = new LinkedList<String>();
			int op;
			String cliente;
			
			do {
			
			System.out.println("\n****************************************************");
			System.out.println("\n                                                    ");
			System.out.println("\n	1 - Adicionar Clientes na Fila                    ");
			System.out.println("\n	2 - Listar todos os Clientes                      ");
			System.out.println("\n	3 - Retirar Cliente da Fila                       ");
			System.out.println("\n	0 - Sair                                          ");
			System.out.println("\n                                                    ");
			System.out.println("\n****************************************************");
			System.out.println("\nEntre com a opção desejada: ");
			op = leia.nextInt();
			
			
			if (op != 0) {
				
			switch(op) {
	
			case 1:
				System.out.println("\nDigite o nome do cliente que deseja adicionar: ");
				cliente = leia.next();
			fila.add(cliente);
			System.out.println("\nCliente adicionado.");
					break;
			case 2:
				System.out.println("\nFila atual: "+fila);
					break;
			case 3:
				if (fila.size()==0) {
					System.out.println("\nA lista já está vazia.");
				}else {
				System.out.println("\nDigite o nome do cliente que deseja retirar: ");
				cliente = leia.next();
				fila.remove(cliente);
				System.out.println("\nCliente removido.");
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

