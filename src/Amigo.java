
public class Amigo extends Pessoa{
	
	private String aniversario;
	
	public Amigo() {
		super.setNome("Indefinido");
		super.setIdade(0);
		this.aniversario = "Indefinido";
	}

	public Amigo(String aniversario) {
		
		this.aniversario = aniversario;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return "Amigo [aniversario= " + aniversario + "]" + " e a idade " + super.getIdade();
	}
	

}
