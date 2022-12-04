

import java.util.Scanner;

public class Principal_Agenda {

	public static void main(String[] args) {
		
		Agenda agenda;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pessoas para a sua agenda: ");
		agenda = new Agenda(sc.nextInt());
		
		System.out.println(agenda.getQtdAmigos());
		System.out.println(agenda.getQtdConhecidos());
		
		agenda.addInformacoes();
		agenda.imprimeAniversario();
		agenda.imprimeEmail();
		
	sc.close();}

}
