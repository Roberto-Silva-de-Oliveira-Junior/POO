package Projeto;

public class Telefone {
	private int dD;
	private int numero;
	private String operadora;
	
	
	@Override
	public String toString() {
		return "Operadora: "+this.operadora+" DD: "+this.dD+" Numero: "+this.numero;
	}
	public Telefone(int dD, int numero, String operadora) {
		super();
		this.dD = dD;
		this.numero = numero;
		this.operadora = operadora;
	}
	public int getdD() {
		return dD;
	}
	public void setdD(int dD) {
		this.dD = dD;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
}
