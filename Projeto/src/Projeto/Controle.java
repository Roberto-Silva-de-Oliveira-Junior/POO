package Projeto;

import java.util.ArrayList;
import java.util.List;

public class Controle {
	private List<Cliente> clientes;
	private List<Funcionario> funcionarios;

	public Controle() {
		this.clientes = new ArrayList<Cliente>();
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public Controle(List<Cliente> clientes, List<Funcionario> funcionarios) {
		super();
		this.clientes = clientes;
		this.funcionarios = funcionarios;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
