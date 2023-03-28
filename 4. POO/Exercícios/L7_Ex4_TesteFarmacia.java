package Exercícios;

public class L7_Ex4_TesteFarmacia {

	public static void main(String[] args) {
		L7_Ex4_Farmacia estoque1 = new L7_Ex4_Farmacia("Nimesulida", "Shampoos", "Bepantol derma", "Mascaras", "Gatorade");
		L7_Ex4_Farmacia estoque2 = new L7_Ex4_Farmacia ("Resfenol", "Condicionadores", "Fraldas","Alcool gel", "Bebida proteica");
		
		estoque1.visualizar();
		estoque2.visualizar();
	}
}