package Exercícios;

public class L7_Ex1_TestaCliente {

	public L7_Ex1_TestaCliente(String nomeCliente, int idadeCliente, String sexoCliente, String cidadeCliente,
			int celularCliente) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		L7_Ex1_Cliente cliente1 = new L7_Ex1_Cliente("Lucas",25,"Masculino","Sumare",971068178);
		L7_Ex1_Cliente cliente2 = new L7_Ex1_Cliente("Sarah",24,"Feminino","Dourados",981818181);
		
		L8_Ex1_PessoaFisica clientepf = new L8_Ex1_PessoaFisica("Sarah",24,"Feminino","Dourados",981818181,"43258887640","Cartao de Debito");
		L8_Ex1_PessoaJuridica clientepj = new L8_Ex1_PessoaJuridica("Lucas Design LTDA",25,"Masculino","Sumare",971068178,"13178566/0001-81","Boleto");
		
		System.out.println("Checando Cadastro:");
		
		cliente1.visualizar();
		
		cliente2.visualizar();
		
		clientepf.infoPF();
		
		clientepj.infoPJ();
	}

}