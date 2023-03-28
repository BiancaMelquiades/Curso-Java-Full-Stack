package Exercícios;

public class L7_Ex2_TesteFuncionário {

	public static void main(String[] args) {
		L7_Ex2_Funcionário funcionario1 = new L7_Ex2_Funcionário("Mariane","123.456.789-89","FullStack Java","Back-end", 1997);
		L7_Ex2_Funcionário funcionario2 = new L7_Ex2_Funcionário("Leona", "345.789.456-99", "Cão suporte de emocional","Dar amor e carinho", 2021);
		
		funcionario1.visualizar();
		funcionario2.visualizar();
	}

}