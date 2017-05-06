package Projeto;

public class Pessoa {
	protected String nome;
	protected static Idade idade;
	protected int rg;
	protected int cpf;

	public Pessoa(String nome, Idade idade, int rg, int cpf) {
		super();
		this.nome = nome;
		Pessoa.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
	}

}
