package Projeto;

public class Telefone {
	private int numero;
	private int prefixo;
	private String operadora;

	public Telefone(int numero, int prefixo, String operadora) {
		super();
		this.numero = numero;
		this.prefixo = prefixo;
		this.operadora = operadora;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(int prefixo) {
		this.prefixo = prefixo;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

}
