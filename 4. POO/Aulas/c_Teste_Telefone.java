package Aulas;

public class c_Teste_Telefone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c_Celular celular = new c_Celular();
		c_Fixo fixo = new c_Fixo();
		c_Publico publico = new c_Publico();
		
		c_Telefone telefone = null;
		
		int n = (int) (Math.random()*3.0);
		System.out.println("\nO número sorteado foi: "+n);
		
		switch(n) {
		
		case 0: telefone = celular;break;
		case 1: telefone = fixo;break;
		case 2: telefone = publico;break;
		default: System.out.println("\nErro inesperado...");
		}
		
		if (telefone != null) {
			telefone.disca("92324544");
			telefone.toca(2);
		}

	}

}
