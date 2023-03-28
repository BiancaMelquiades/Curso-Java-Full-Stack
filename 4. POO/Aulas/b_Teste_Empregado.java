package Aulas;

public class b_Teste_Empregado {

	public static void main(String[] args) {
		
		b_Empregado[] lista = new b_Empregado[3];
		
		lista[0] = new b_Empregado("Beatriz Angelita",15000);
		lista[1] = new b_Empregado("Júlia Guarnieri",50000);
		lista[2] = new b_Empregado("William Reis",10000);
		
		for(b_Empregado roda:lista) {
			roda.imprimir();
		}
		System.out.println("******************************************");
		for(b_Empregado roda:lista) {
			roda.aumentarSalario(10);
			roda.imprimir();
		}

	}

}
