package questao08;

import java.util.ArrayList;
import java.util.List;
public class CadastroPessoas  {
	private List<Pessoa> pessoas;
	
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
