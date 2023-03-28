package Aulas;

public class c_Celular extends c_Telefone{
	
	public c_Celular () {
		super("Telefone Celular");
	}
	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		
		case 1:
			System.out.println("Pin pin pin");
			break;
		case 2:
			System.out.println("Iu iu iu");
			break;
		default:
			System.out.println("Ta tananana tananana");
			break;
		}
	}
	@Override
	public void disca(String numero) {
		System.out.println("\nO número: "+numero+" é um celular...");
	}

}
