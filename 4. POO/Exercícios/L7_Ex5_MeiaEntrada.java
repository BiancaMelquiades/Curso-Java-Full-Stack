package Exercícios;

import java.sql.Date;

public class L7_Ex5_MeiaEntrada extends L7_Ex5_Ingresso {

	private double ValorMeia;

	public L7_Ex5_MeiaEntrada(String nome, Double rG, Date dataCompra, String artista, String local, double valorMeia) {
		super(nome, rG, dataCompra, artista, local);
		this.ValorMeia = valorMeia;
	}
	
	public void visualizarMeia() {
		super.visualizar();
		System.out.println ("Valor da meia entrada: "+ValorMeia);
	}

	public double getValorMeia() {
		return ValorMeia;
	}

	public void setValorMeia(double valorMeia) {
		ValorMeia = valorMeia;
	}
		
	
	
}
