package Exercícios;

public class L7_Ex5_Teste_Ingresso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		L7_Ex5_Ingresso ingresso1 = new L7_Ex5_Ingresso("Mariane", 123.456, Date(), "Rihanna","Jundiaí - City");
		L7_Ex5_Ingresso ingresso2 = new L7_Ex5_Ingresso("Leona", 45.369, Date(), "Twenty One Pilots", "Jundiaí-City");
		
		ingresso1.visualizar();
		ingresso2.visualizar();
	
	
	L7_Ex5_Vip ingressoVip = new L7_Ex5_Vip("Raffa",123.654, Date(),"Lana Delray" , "São Paulo", 125);
	L7_Ex5_MeiaEntrada ingressoMeia = new L7_Ex5_MeiaEntrada("Noah", 789.564, Date(),"Power  Ranger", "Campinas", 10);
	
	ingressoVip.visualizar();
	ingressoMeia.visualizarMeia();
	
	}

	public static Date Date() {
		// TODO Auto-generated method stub
		return null;
	}

}