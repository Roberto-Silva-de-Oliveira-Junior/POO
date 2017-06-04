package Projeto;

public class Cliente extends Pessoa{

	private Data dataDeInicio;
	private Treino treino;
	private String turno;
	private boolean status;
	private String profResp;
	
	public Cliente(String nome, String cpf, String rg, Contato contato, Data dataNascimento, Data dataDeInicio,
			Treino treino, String turno, boolean status, String profResp) {
		super(nome, cpf, rg, contato, dataNascimento);
		this.dataDeInicio = dataDeInicio;
		this.treino = treino;
		this.turno = turno;
		this.status = status;
		this.profResp = profResp;
	}
	public Data getDataDeInicio() {
		return dataDeInicio;
	}
	public void setDataDeInicio(Data dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	public Treino getTreino() {
		return treino;
	}
	public void setTreino(Treino treino) {
		this.treino = treino;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getProfResp() {
		return profResp;
	}
	public void setProfResp(String profResp) {
		this.profResp = profResp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataDeInicio == null) ? 0 : dataDeInicio.hashCode());
		result = prime * result + ((profResp == null) ? 0 : profResp.hashCode());
		result = prime * result + (status ? 1231 : 1237);
		result = prime * result + ((treino == null) ? 0 : treino.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
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
		Cliente other = (Cliente) obj;
		if (dataDeInicio == null) {
			if (other.dataDeInicio != null)
				return false;
		} else if (!dataDeInicio.equals(other.dataDeInicio))
			return false;
		if (profResp == null) {
			if (other.profResp != null)
				return false;
		} else if (!profResp.equals(other.profResp))
			return false;
		if (status != other.status)
			return false;
		if (treino == null) {
			if (other.treino != null)
				return false;
		} else if (!treino.equals(other.treino))
			return false;
		if (turno == null) {
			if (other.turno != null)
				return false;
		} else if (!turno.equals(other.turno))
			return false;
		return true;
	}
	
	

}
