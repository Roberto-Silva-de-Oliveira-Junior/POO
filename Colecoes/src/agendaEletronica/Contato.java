package agendaEletronica;

public class Contato{
	private String nome;
	private int numero;
	private String email;
	
	public Contato(String nome, int numero, String email){
		this.nome=nome;
		this.numero=numero;
		this.email=email;
	}
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else {
			if (obj instanceof Contato) {
				Contato a = (Contato) obj;
				if (a.getEmail().equals(this.email) && a.getNome().equals(this.nome) && a.getNumero() == this.numero) {
					return true;
				}
			}
			return false;
		}
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
