package agendaEletronicaComHashMap;

public class Contato {
	private int numero;
	private String email;
	
	public Contato(int numero, String email){
		this.numero=numero;
		this.email=email;
	}
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else {
			if (obj instanceof Contato) {
				Contato a = (Contato) obj;
				if (a.getEmail().equals(this.email) && a.getNumero() == this.numero) {
					return true;
				}
			}
			return false;
		}
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
