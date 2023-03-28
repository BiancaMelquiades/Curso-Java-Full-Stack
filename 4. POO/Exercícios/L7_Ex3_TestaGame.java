package Exercícios;

public class L7_Ex3_TestaGame {

	public static void main(String[] args) {
		L7_Ex3_Produto estoque1 = new L7_Ex3_Produto("Playstation 5 ", 35.40 , "Orizon Zero Down e God of war ", " Pc e console", "Azul");
		L7_Ex3_Produto estoque2 = new L7_Ex3_Produto("Xbox",25.2, "Call of Duty", "Console", "Xadrez");
		
		estoque1.visualizar();
		estoque2.visualizar();
	}

}