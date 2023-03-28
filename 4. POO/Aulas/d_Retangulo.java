package Aulas;

public class d_Retangulo extends d_BaseFigura implements d_Figuras{
	
	d_Retangulo(double lado1, double lado2, String nome){
		super(lado1,lado2,nome);
		nomeClasse = "Retângulo";
	}
	
	@Override
	public double getDiagonal() {
		return Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2));
	}

}
