package Projeto;


import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Treinador extends Funcionario {
	private Acesso acesso;
	private List<Cliente> listaDeClientes;

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}

	public List<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	public void setListaDeClientes(List<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}

	public Treinador(String nome, String cpf, String rg, Contato contato, Data dataNascimento, double salario,
			String turno, String funcao, Acesso acesso, List<Cliente> listaDeClientes) {
		super(nome, cpf, rg, contato, dataNascimento, salario, turno, funcao);
		this.acesso = acesso;
		this.listaDeClientes = listaDeClientes;
	}

	public boolean addCliente(Cliente c) {
		for (Cliente a : this.listaDeClientes) {
			if (a.equals(c)) {
				JOptionPane.showMessageDialog(null, "Cliente ja cadastrado !!!");
				return false;
			}
		}
		this.listaDeClientes.add(c);
		JOptionPane.showMessageDialog(null, "Cliente cadastrado !!!");
		return true;

	}

	public boolean removerCliente(String cpf) {
		Iterator<Cliente> i = this.listaDeClientes.iterator();
		while (i.hasNext()) {
			Cliente a = i.next();
			if (a.getCpf().equals(cpf)) {
				i.remove();
				JOptionPane.showMessageDialog(null, "Cliente removido !!!");
				return true;
			}
		}
		JOptionPane.showMessageDialog(null, "Cliente nao encrontrado !!!");
		return false;
	}

	public Cliente pesquisarCliente(String cpf) {
		for (Cliente c : listaDeClientes) {
			if (c.getCpf().equals(cpf)) {
				JOptionPane.showMessageDialog(null, "Cliente encontrado !!!");
				return c;
			}
		}
		JOptionPane.showMessageDialog(null, "Cliente nao encontrado !!!");
		return null;

	}

}
