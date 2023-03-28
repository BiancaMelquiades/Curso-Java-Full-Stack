package Aulas;

public class c_Fixo extends c_Telefone {

	public c_Fixo() {
		super("Telefone Fixo");
		
	}
	@Override
	public void toca(int numToques) {
		
		for (int i=0;i<numToques;i++) {
			System.out.println("Triiiiiiim triiiiiiim triiiiiiim");
		}
	}
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando para o número: "+numero);
	}
	
}
