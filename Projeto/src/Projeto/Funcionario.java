package Projeto;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario extends Pessoa {
	private double salario;
	private List<CargaHoraria> horarioDeTrabalho;

	public Funcionario(String nome, Idade idade, int rg, int cpf) {
		super(nome, idade, rg, cpf);
		this.horarioDeTrabalho = new ArrayList<CargaHoraria>();
		this.salario = 0.0;
	}

	public void addHorasDia(CargaHoraria ch) {
		this.horarioDeTrabalho.add(ch);
	}

	public boolean removerDia(String dia) {
		for (CargaHoraria c : this.horarioDeTrabalho) {
			if (c.getDia().equals(dia)) {
				this.horarioDeTrabalho.remove(c);
				return true;
			}
		}
		return false;
	}

	public abstract double calculaSalario(double salario, List<CargaHoraria> horarioDeTrabalho);

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<CargaHoraria> getHorarioDeTrabalho() {
		return horarioDeTrabalho;
	}

	public void setHorarioDeTrabalho(List<CargaHoraria> horarioDeTrabalho) {
		this.horarioDeTrabalho = horarioDeTrabalho;
	}

}
