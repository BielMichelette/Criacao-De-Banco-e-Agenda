
public class Conhecido extends Pessoa{
	private String email;
	
	public Conhecido() {
		super.setNome("Indefinido");
		super.setIdade(0);
		this.email = "Indefinido";
	}

	public Conhecido(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Conhecido [email= " + email + "]";
	}

}
