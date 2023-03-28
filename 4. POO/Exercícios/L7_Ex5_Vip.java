package Exercícios;

import java.sql.Date;

public class L7_Ex5_Vip extends L7_Ex5_Ingresso {

	private double valorVip;	
	
	public L7_Ex5_Vip(String nome, Double rG, Date dataCompra, String artista, String local, double valorVip) {
		super(nome, rG, dataCompra, artista, local);
		this.valorVip=valorVip;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Valor do ingresso VIP: "+valorVip);
		
	}
	
	public double getValorVip() {
		return valorVip;
	}

	public void setValorVip(double valorVip) {
		this.valorVip = valorVip;
	}

	
}