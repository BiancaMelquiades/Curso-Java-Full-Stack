package Pratica_Plataforma;

public class b_ControleDeFluxo_IfeElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int estoque = 75;
		
		if(estoque >= 100) {
			System.out.println("Produto suficiente");
		}else if(estoque <100 && estoque > 50) {
			System.out.println("Alerta : Avaliar possibilidade de novo pedido");
		}else {
			System.out.println("Atenção faça um novo pedido");
		}

	}

}
