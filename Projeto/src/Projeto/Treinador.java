package Projeto;

import java.io.IOException;
import java.util.List;

public class Treinador extends Funcionario {

	private Controle controle;
	private List<Cliente> listaDeClientes;

	public Treinador(String nome, Idade idade, int rg, int cpf, Controle controle, List<Cliente> listaDeClientes) {
		super(nome, idade, rg, cpf);
		this.controle = controle;
		this.listaDeClientes = controle.getClientes();
	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public List<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	public void setListaDeClientes(List<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}

	public void cadastraClientes(Cliente c) throws IOException {
		for (Cliente a : this.listaDeClientes) {
			if (a.equals(c)) {
				throw new IOException("Cliente ja cadastrado !!!");
			}
		}
		this.listaDeClientes.add(c);
	}

	public boolean removeClientes(Cliente c) {
		for (Cliente a : this.listaDeClientes) {
			if (a.equals(c)) {
				this.listaDeClientes.remove(a);
				return true;
			}
		}
		return false;
	}

	public void addTreinoDoCliente(Cliente c, Treino t) throws IOException {
		for (Cliente a : this.listaDeClientes) {
			if (a.equals(c)) {
				a.addTreino(t);
			}
		}

	}

	public boolean removerTreinoDoCliente(Cliente c, String dia) {
		for (Cliente a : this.listaDeClientes) {
			if (a.equals(c)) {
				a.removerTreino(dia);
				return true;
			}
		}
		return false;
	}

	public double calculaSalario(double salario, List<CargaHoraria> horarioDeTrabalho) {
		List<CargaHoraria> cargH = super.getHorarioDeTrabalho();
		double horas = 0.0;
		for (CargaHoraria a : cargH) {
			horas += a.horasTrabalhadasNoDia();
		}
		return horas * super.getSalario();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((controle == null) ? 0 : controle.hashCode());
		result = prime * result + ((listaDeClientes == null) ? 0 : listaDeClientes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treinador other = (Treinador) obj;
		if (controle == null) {
			if (other.controle != null)
				return false;
		} else if (!controle.equals(other.controle))
			return false;
		if (listaDeClientes == null) {
			if (other.listaDeClientes != null)
				return false;
		} else if (!listaDeClientes.equals(other.listaDeClientes))
			return false;
		return true;
	}

}
