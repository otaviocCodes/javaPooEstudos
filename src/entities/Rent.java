package entities;

public class Rent {
	private String nome;
	private String email;

	public Rent() {
	}

	public Rent(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getName() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Email: " + email;
	}

}
