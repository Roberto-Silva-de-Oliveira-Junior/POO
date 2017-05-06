package Projeto;

public class CargaHoraria {
	private double horarioDeChegada;
	private double horarioDeSaida;
	private String dia;

	public CargaHoraria(double horarioDeChegada, double horarioDeSaida, String dia) {
		super();
		this.horarioDeChegada = horarioDeChegada;
		this.horarioDeSaida = horarioDeSaida;
		this.dia = dia;
	}

	public double getHorarioDeChegada() {
		return horarioDeChegada;
	}

	public void setHorarioDeChegada(double horarioDeChegada) {
		this.horarioDeChegada = horarioDeChegada;
	}

	public double getHorarioDeSaida() {
		return horarioDeSaida;
	}

	public void setHorarioDeSaida(double horarioDeSaida) {
		this.horarioDeSaida = horarioDeSaida;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public double horasTrabalhadasNoDia() {
		return this.horarioDeSaida - this.horarioDeChegada;
	}
	

}
