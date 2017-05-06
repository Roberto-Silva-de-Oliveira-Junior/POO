package Projeto;

public class Contato {
	private Telefone telefone;
	private String email;
	private Endereco endereco;

	public Contato(Telefone telefone, String email, Endereco endereco) {
		super();
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
