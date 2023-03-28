package Aulas;

public class d_TesteFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		d_Quadrado fig1 = new d_Quadrado (10,"Quadrado1");
		d_Retangulo fig2 = new d_Retangulo (3,4,"Retângulo1");
		
		System.out.println(fig1.getNome()+" : "+fig1.getDiagonal());
		System.out.println(fig2.getNome()+" : "+fig2.getDiagonal());
	}

}
