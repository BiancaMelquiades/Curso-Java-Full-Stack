package Aulas;

public abstract class c_Telefone {

	private String tipo;
	
	abstract public void disca(String numero);
	abstract public void toca(int numToques);
	
	public c_Telefone(String tipo) {
		super();
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
