package Projeto;

public class Contato {
	private Telefone telefoe;
	private String email;
	public Contato(Telefone telefoe, String email, Endereco endereco) {
		super();
		this.telefoe = telefoe;
		this.email = email;
		this.endereco = endereco;
	}
	public Telefone getTelefoe() {
		return telefoe;
	}
	public void setTelefoe(Telefone telefoe) {
		this.telefoe = telefoe;
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
	private Endereco endereco;
	
}
