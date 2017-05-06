package Projeto;

import java.io.IOException;
import java.util.List;

public class Cliente extends Pessoa {
	private List<Treino> listaDeTreinos;
	private String turno;
	private Status estatos;

	public Cliente(String nome, Idade idade, int rg, int cpf, List<Treino> listaDeTreinos, String turno,
			Status estatos) {
		super(nome, idade, rg, cpf);
		this.listaDeTreinos = listaDeTreinos;
		this.turno = turno;
		this.estatos = estatos;
	}

	public List<Treino> getListaDeTreinos() {
		return listaDeTreinos;
	}

	public void setListaDeTreinos(List<Treino> listaDeTreinos) {
		this.listaDeTreinos = listaDeTreinos;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Status getEstatos() {
		return estatos;
	}

	public void setEstatos(Status estatos) {
		this.estatos = estatos;
	}

	public String toString() {
		return this.listaDeTreinos.toString() + " (" + this.turno + "," + this.estatos + ")";
	}

	public void addTreino(Treino t) throws IOException {
		for (Treino b : this.listaDeTreinos) {
			if (b.equals(t)) {
				throw new IOException("Esse elemento ja foi cadastrado !!!");
			}
		}
		this.listaDeTreinos.add(t);
	}

	public boolean removerTreino(String dia) {
		for (Treino b : this.listaDeTreinos) {
			if (b.getDia().equals(dia)) {
				this.listaDeTreinos.remove(b);
				return true;
			}
		}
		return false;
	}

	public boolean alterarTreino(Treino t, String tipo, String dia, String descricao) {
		for (Treino b : this.listaDeTreinos) {
			if (b.equals(t)) {
				b.setTipo(tipo);
				b.setDia(dia);
				b.setDescricao(descricao);
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estatos == null) ? 0 : estatos.hashCode());
		result = prime * result + ((listaDeTreinos == null) ? 0 : listaDeTreinos.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (estatos == null) {
			if (other.estatos != null)
				return false;
		} else if (!estatos.equals(other.estatos))
			return false;
		if (listaDeTreinos == null) {
			if (other.listaDeTreinos != null)
				return false;
		} else if (!listaDeTreinos.equals(other.listaDeTreinos))
			return false;
		if (turno == null) {
			if (other.turno != null)
				return false;
		} else if (!turno.equals(other.turno))
			return false;
		return true;
	}

}
