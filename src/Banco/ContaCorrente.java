package Banco;


public class ContaCorrente extends ContaBancaria {
	private int qtdTransRealizadas;
	

	public int getQtdTransRealizadas() {
		return qtdTransRealizadas;
	}

	public void setQtdTransRealizadas(int qtdTransRealizadas) {
		this.qtdTransRealizadas = qtdTransRealizadas;
	}

	public ContaCorrente(String Senha, String nome, int nroConta) {
		super();
		super.nroConta = nroConta;
		super.nomeUsuario = nome;
		super.senha = Senha;
		super.saldo = 0;
	}
	public ContaCorrente(String Senha, double saldo, String nome, int id) {
		super();
		super.nroConta = id;
		super.nomeUsuario = nome;
		super.senha = Senha;
		super.saldo = saldo;
	}
	

	

	@Override
	public void saca(double valor) {
		System.out.print("Informe a sua senha: ");
		String auxSenha = sc.next();
		if(auxSenha.equals(super.senha)) {
			super.saldo -= valor;
			this.qtdTransRealizadas++;
		}
		else {
			System.out.println("Senha incorreta.");
		}
		
	}

	@Override
	public void deposita(double valor) {
		System.out.print("Informe a sua senha: ");
		String auxSenha = sc.next();
		if(auxSenha.equals(super.senha)) {
			super.saldo = valor;
			this.qtdTransRealizadas++;
		}
		else {
			System.out.println("Senha incorreta.");
		}
	}

	@Override
	public void tiraExtrato() {
		System.out.print("Informe a sua senha: ");
		String auxSenha = sc.next();
		if(auxSenha.equals(super.senha)) {
		System.out.println("\nNumero Conta: " + super.nroConta + 
				"Nome: " + super.nomeUsuario + 
				"\nSaldo: " + super.saldo + 
				"\nQuantidade de Transacoes: " + this.qtdTransRealizadas);
		}
		else {
			System.out.println("Senha incorreta.");
		}
	}

	@Override
	public String toString() {
		return "Numero Conta:" + super.nroConta 
				+"\nNome: " + super.nomeUsuario 
				+ "\nTransacoes Realizadas " + this.qtdTransRealizadas + "\n";
	
	}

	@Override
	public String impressaoRendimento() {
		return null;
	}
 
	
}
