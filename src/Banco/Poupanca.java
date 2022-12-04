package Banco;

public class Poupanca extends ContaBancaria {
	
	private double saldoTaxaRendimento;
	
	public double getSaldoTaxaRendimento() {
		return saldoTaxaRendimento;
	}

	public void setSaldoTaxaRendimento(int saldoTaxaRendimento) {
		this.saldoTaxaRendimento = saldoTaxaRendimento;
	}

	public Poupanca(String Senha, String nome, int nroConta) {
		super();
		super.nroConta = nroConta;
		super.nomeUsuario = nome;
		super.senha = Senha;
		super.saldo = 0;
	}
	
	public Poupanca(String Senha, double saldo, String nome, int id) {
		super();
		super.nroConta = id;
		super.nomeUsuario = nome;
		super.senha = Senha;
		super.saldo = saldo;
	}
	@Override
	public String impressaoRendimento() {
		return "Nome do Usuario: " + super.nomeUsuario + " Taxa de rendimento da conta R$:" + this.saldoTaxaRendimento;
	}

	@Override
	public void saca(double valor) {

		System.out.print("Informe a sua senha: ");
		String auxSenha = sc.next();
		if(auxSenha.equals(super.senha)) {
			super.saldo -= valor;
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
			double taxaDeAcrescimo = 0.0015;
			super.saldo = valor * ( 1 + taxaDeAcrescimo );
			this.saldoTaxaRendimento = valor * taxaDeAcrescimo;
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
				"\nTaxa de rendimento aplicada: " + this.saldoTaxaRendimento);
		}else {
			System.out.println("Senha incorreta.");
		}
		
	}

	@Override
	public String toString() {
		return "Numero Conta:" + super.nroConta 
				+"\nNome: " + super.nomeUsuario  
				+ "\nTaxa de rendimento aplicada R$:" + this.saldoTaxaRendimento + "\n";
	}

	

    
}