package Exercícios;

public class L8_Ex1_PessoaJuridica extends L7_Ex1_Cliente {

	private String cnpj;
	private String mtdPagamento;
	
	public L8_Ex1_PessoaJuridica(String nomeCliente, int idadeCliente, String sexoCliente, String cidadeCliente,
			int celularCliente, String cnpj, String mtdPagamento) {
		super(nomeCliente, idadeCliente, sexoCliente, cidadeCliente, celularCliente);
		this.cnpj = cnpj;
		this.mtdPagamento = mtdPagamento;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getMtdPagamento() {
		return mtdPagamento;
	}
	public void setMtdPagamento(String mtdPagamento) {
		this.mtdPagamento = mtdPagamento;
	}
	public void infoPJ() {
		
		System.out.println("\nO cliente "+getNomeCliente()+". \nPortador do CNPJ:"+cnpj
				+"\nUtiliza o metodo de pagamento:"+mtdPagamento);
	}
	
	
}