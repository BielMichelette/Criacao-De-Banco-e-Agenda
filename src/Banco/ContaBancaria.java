package Banco;

import java.util.Scanner;

public abstract class ContaBancaria {
	
	Scanner sc = new Scanner(System.in);
	public int nroConta;
	public String nomeUsuario;
    public String senha;
    public double saldo;
    
    public abstract void saca(double valor);
    public abstract void deposita(double valor);
    public abstract void tiraExtrato();
    public abstract String toString();

	public abstract String impressaoRendimento();
    
    public void alterarSenha(String senha) {
    	System.out.print("Informe a sua senha antiga: ");
    	String aux = sc.next();
    	if( aux.equals(this.senha)){
    		this.senha = senha;
    		System.out.println("Senha alterada com sucesso");
    	}
    	else {
    		System.out.println("Senha incorreta!");
    	}
    }
    
}
