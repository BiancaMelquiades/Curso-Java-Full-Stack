package Lista_de_Exercícios;

import java.util.Scanner;

public class L1_Ex3_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario,adicional,extra,desconto,liquido;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira os dados solicitados para calcular o salário líquido");
		System.out.println("\nSalário Bruto: ");
		salario = leia.nextFloat();
		System.out.println("\nAdicional Noturno: ");
		adicional = leia.nextFloat();
		System.out.println("\nHoras Extras: ");
		extra = leia.nextFloat();
		System.out.println("\nDescontos: ");
		desconto = leia.nextFloat();
		
		liquido = salario+adicional+extra-desconto;
		
		System.out.println("\n\nSalário Líquido: "+liquido);

	}

}
