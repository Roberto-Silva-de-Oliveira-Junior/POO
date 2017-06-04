package Projeto;

public class Funcionario extends Pessoa {
	private double salario;
	private String turno;
	private String funcao;
	
	public Funcionario(String nome, String cpf, String rg, Contato contato, Data dataNascimento, double salario,
			String turno, String funcao) {
		super(nome, cpf, rg, contato, dataNascimento);
		this.salario = salario;
		this.turno = turno;
		this.funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
