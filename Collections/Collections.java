package Aulas_Introdução_Java;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2);//estou adicionando um elemento para dentro da minhaLista
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(2);
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(3);
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovvendo um elemento da lista  ");
		System.out.println();
		minhaLista.remove(0);
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
	}

}
