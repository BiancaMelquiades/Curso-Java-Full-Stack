package Aulas;

public class d_Quadrado extends d_BaseFigura implements d_Figuras{

	d_Quadrado(double lado, String nome) {
		super(lado,lado,nome);
		nomeClasse = "Quadrado";
	}
	@Override
	public double getDiagonal() {
		return Math.sqrt(2)*lado1;
	}
}
