package Projeto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
	private Controle controle;
	private List<Treinador> treinado;

	public Gerente(String nome, Idade idade, int rg, int cpf, Controle controle, List<Treinador> treinado) {
		super(nome, idade, rg, cpf);
		this.controle = controle;
		this.treinado = new ArrayList<Treinador>();

	}

	public double calculaSalario(double salario, List<CargaHoraria> horarioDeTrabalho) {
		List<CargaHoraria> cargH = super.getHorarioDeTrabalho();
		double horas = 0.0;
		for (CargaHoraria a : cargH) {
			horas += a.horasTrabalhadasNoDia();
		}
		return horas * super.getSalario();
	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public List<Treinador> getTreinado() {
		return treinado;
	}

	public void setTreinado(List<Treinador> treinado) {
		this.treinado = treinado;
	}

	public void addTreinador(Treinador t) throws IOException {
		for (Treinador a : this.treinado) {
			if (a.equals(t)) {
				throw new IOException();
			}
		}
		this.treinado.add(t);
	}

	public boolean removerTreinador(Treinador t) {
		for (Treinador a : this.treinado) {
			if (a.equals(t)) {
				this.treinado.remove(a);
				return true;
			}
		}
		return false;

	}

	public void alterarSalario(Treinador t, double salario) {
		for (Treinador a : this.treinado) {
			if (a.equals(t)) {
				a.setSalario(salario);
			}
		}

	}

}
