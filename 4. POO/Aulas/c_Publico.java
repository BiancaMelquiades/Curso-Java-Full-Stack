package Aulas;

public class c_Publico extends c_Telefone{

	public c_Publico() {
		super("Telefone Público");
		// TODO Auto-generated constructor stub
	}

		@Override
		public void toca (int numToques) {
			for (int i=0;i<numToques;i++) {
				System.out.println("Trommm Trommm Tromm");
			}
		}
		
		@Override
		public void disca(String numero) {
			if(numero.charAt(0) == '9' || numero.charAt(0) == '8') {
				System.out.println("\nEste telefone não faz ligação para celular...");
			}else {
				System.out.println("\nDiscando: "+numero);
			}
		}
}
