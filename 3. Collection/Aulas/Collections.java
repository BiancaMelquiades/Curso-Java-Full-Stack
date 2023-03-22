package Aulas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
		
		System.out.println("\nRemovvendo um elemento da lista");
		System.out.println();
		minhaLista.remove(0);
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		int primeiroElemento = minhaLista.get(0);
		
		System.out.println("\nOprimeiro elemento é:"+primeiroElemento);
		System.out.println();
		
		for(int i=0;i<minhaLista.size();i++) {
			System.out.println("\nElemento: "+minhaLista.get(i));
			
		}
		
		Collections.sort(minhaLista);
		System.out.println("\nDepois de ordenado.....");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(4);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(2);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
		}
		
	}

	private static void sort(List<Integer> minhaLista) {
		// TODO Auto-generated method stub
		
	}


}
