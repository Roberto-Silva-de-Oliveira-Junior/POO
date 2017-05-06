package Projeto;

public class Status {
	private double peso;
	private double massaGorda;
	private double massaMagra;
	private double altura;
	private String sexo;

	public Status(double peso, double massaGorda, double massaMagra, double altura, String sexo) {
		super();
		this.peso = peso;
		this.massaGorda = massaGorda;
		this.massaMagra = massaMagra;
		this.altura = altura;
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getMassaGorda() {
		return massaGorda;
	}

	public void setMassaGorda(double massaGorda) {
		this.massaGorda = massaGorda;
	}

	public double getMassaMagra() {
		return massaMagra;
	}

	public void setMassaMagra(double massaMagra) {
		this.massaMagra = massaMagra;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
