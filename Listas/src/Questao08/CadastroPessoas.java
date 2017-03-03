package Questao08;

import java.util.ArrayList;

public class CadastroPessoas  {
	protected ArrayList<Pessoa> pessoas;
	
	public CadastroPessoas(){
		pessoas = new ArrayList<Pessoa>();
	}
	public void cadastraPessoas(Pessoa pessoa){
		this.pessoas.add(pessoa);
	}
	public void imprimeCadastro(){
		for(Pessoa c: pessoas){
			c.imprimeDados();
		}
	}
}
