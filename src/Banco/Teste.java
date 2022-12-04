package Banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ContaBancaria> contas = new ArrayList<>();
		System.out.print("Informe a quantidade de contas a serem criadas: ");
		int qtdContas = sc.nextInt();

		for (int i = 0; i < qtdContas; i++) {
			System.out.println();
			System.out.print("Qual tipo de conta deseja criar\n1 - Corrente\n2 - Poupanca\n");
			int tipoCont = sc.nextInt();
			if (tipoCont == 1) {
				ContaCorrente corr;
				System.out.print("Informe o Numero da Conta: ");
				int nroConta = sc.nextInt();
				while (hasNroConta(contas, nroConta)) {
					System.out.println("Numero da conta ja existente insira um novo numero: ");
					nroConta = sc.nextInt();
				}
				System.out.print("Informe o seu Nome: ");
				String nome = sc.next();
				System.out.print("Crie uma senha: ");
				String Senha = sc.next();
				System.out.print("Deseja entrar com algum valor na sua conta Y/N? ");
				char escolha = sc.next().charAt(0);
				escolha = Character.toUpperCase(escolha);
				if (escolha == 'N') {
					corr = new ContaCorrente(Senha, nome, nroConta);
				} else {
					System.out.print("Informe o valor a ser inserido: ");
					double saldo = sc.nextDouble();
					corr = new ContaCorrente(Senha, saldo, nome, nroConta);
				}
				contas.add(corr);
			} else if (tipoCont == 2) {
				Poupanca poup;
				System.out.print("Informe o Numero da Conta: ");
				int nroConta = sc.nextInt();
				while (hasNroConta(contas, nroConta)) {
					System.out.println("Numero da conta ja existente insira um novo numero: ");
					nroConta = sc.nextInt();
				}

				System.out.print("Informe o seu Nome: ");
				String nome = sc.next();
				System.out.print("Crie uma senha: ");
				String Senha = sc.next();
				System.out.print("Deseja entrar com algum valor na sua conta Y/N? ");
				char escolha = sc.next().charAt(0);
				escolha = Character.toUpperCase(escolha);
				if (escolha == 'N') {
					poup = new Poupanca(Senha, nome, nroConta);
				} else {
					System.out.print("Informe o valor a ser inserido: ");
					double saldo = sc.nextDouble();
					poup = new Poupanca(Senha, nome, nroConta);
					poup.deposita(saldo);
				}
				contas.add(poup);
			}
		}

		for (ContaBancaria txRendimento : contas) {
			if (txRendimento != null) {
				System.out.println(txRendimento.impressaoRendimento());
			} else {
				System.out.println();
			}
		}
		System.out.println();
		System.out.print("Infome o numero da sua conta que deseja fazer alguma transacao: ");
		int NumCont = sc.nextInt();

		System.out.println();
		System.out
				.println("Deseja fazer alguma transacao? \n1 - Saque\n2 - Deposito\n3 - Extrato\n4 - Alterar senha\n");
		int trans = sc.nextInt();
		switch (trans) {
		case (1):
			ContaBancaria contSaq = contas.stream().filter(x -> x.nroConta == NumCont).findFirst().orElse(null);
			if (contSaq == null) {
				System.out.println("Essa Conta nao existe");
			} else {
				System.out.print("Informe o valor que deseja saquar: ");
				double Saque = sc.nextDouble();
				contSaq.saca(Saque);
				;
			}
			break;
		case (2):
			ContaBancaria contDep = contas.stream().filter(x -> x.nroConta == NumCont).findFirst().orElse(null);
			if (contDep == null) {
				System.out.println("Essa Conta nao existe");
			} else {
				System.out.print("Informe o valor que deseja depositar: ");
				double Deposito = sc.nextDouble();
				contDep.deposita(Deposito);

			}
			break;
		case (3):
			ContaBancaria contExt = contas.stream().filter(x -> x.nroConta == NumCont).findFirst().orElse(null);
			if (contExt == null) {
				System.out.println("Essa Conta nao existe");
			} else {
				contExt.tiraExtrato();
			}
			break;
		case (4):
			ContaBancaria contSenha = contas.stream().filter(x -> x.nroConta == NumCont).findFirst().orElse(null);
			if (contSenha == null) {
				System.out.println("Essa Conta nao existe");
			} else {
				System.out.println("Infome a senha que deseja alterar: ");
				String senha = sc.next();
				contSenha.alterarSenha(senha);
			}
			break;
		default:
			System.out.println("Funcao invalida");
			break;
		}

		System.out.println();
		System.out.println("Lista de contas:");
		for (ContaBancaria e : contas) {
			System.out.println(e);
		}

		sc.close();
	}

	private static boolean hasNroConta(List<ContaBancaria> contas, int nroConta) {
		ContaBancaria cont = contas.stream().filter(x -> x.nroConta == nroConta).findFirst().orElse(null);
		return cont != null;
	}

}
