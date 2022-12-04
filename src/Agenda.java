import java.util.Scanner;

public class Agenda {
	Scanner sc = new Scanner(System.in);
	private int qtdAmigos;
	private int qtdConhecidos;
	private Amigo[] amigos;
	private Conhecido[] conhecidos;


	public int getQtdAmigos() {
		return qtdAmigos;
	}

	public void setQtdAmigos(int qtdAmigos) {
		this.qtdAmigos = qtdAmigos;
	}

	public int getQtdConhecidos() {
		return qtdConhecidos;
	}

	public void setQtdConhecidos(int qtdConhecidos) {
		this.qtdConhecidos = qtdConhecidos;
	}

	public Agenda(int qtdPessoas) {
		
		for(int i = 0; i < qtdPessoas; i++) {
			
			int aux = 1 + (int) (Math.random() * 2);
			
			if(aux == 1) {
				qtdAmigos++;
			}
			else if(aux == 2) {
				qtdConhecidos++;
			}
			aux = 0;
		}

		amigos = new Amigo[qtdAmigos];
		conhecidos = new Conhecido[qtdConhecidos];
	}
	
	public void addInformacoes() {
		if(this.qtdAmigos != 0) {
			System.out.println("Adicione as informacoes para os Amigos: ");
			int aux = 1;
			for(int i = 0; i < amigos.length; i++) {
			
				amigos[i] = new Amigo();
				System.out.print("Nome do " + aux + " Amigo: ");
				amigos[i].setNome(sc.next());
				System.out.print("Idade do " + aux + " Amigo: ");
				amigos[i].setIdade(sc.nextInt());
				System.out.print("Data de aniversario do " + aux + " Amigo: ");
				amigos[i].setAniversario(sc.next());
				aux++;
			}
		}
		
		if(this.qtdConhecidos != 0) {
			System.out.println("Adicione as informacoes para os Conhecidos: ");
			int aux = 1;
			for(int i = 0; i < conhecidos.length; i++) {
				
				conhecidos[i] = new Conhecido();
				System.out.print("Nome do " + aux + " Conhecido: ");
				conhecidos[i].setNome(sc.next());
				System.out.print("Idade do " + aux + " Conhecido: ");
				conhecidos[i].setIdade(sc.nextInt());
				System.out.print("Email do " + aux + " Conhecido: ");
				conhecidos[i].setEmail(sc.next());
				aux++;
				
			}
		}
	}
	
	public void imprimeAniversario() {
		for(int i = 0 ; i < amigos.length; i++) {
			int aux = 1;
			System.out.println(aux + " " + amigos[i].toString());
			aux++;
		}
	}
	
	public void imprimeEmail() {
		for(int i = 0 ; i < conhecidos.length; i++) {
			int aux = 1;
			System.out.println(aux + " " + conhecidos[i].toString());
			aux++;
		}
	}
}
