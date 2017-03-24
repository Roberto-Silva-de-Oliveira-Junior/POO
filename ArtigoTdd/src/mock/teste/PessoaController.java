package mock.teste;

public class PessoaController {
	 private PessoaDAO pessoaDAO;
	 private GeradorDeLog log;
	 
	 public PessoaController(GeradorDeLog log){
		 pessoaDAO = new PessoaDAO();
		 this.log = log;
	 }
	 public void exclui(Pessoa pessoa){
		 PessoaDAO.exclui(pessoa);
		 log.criaLog(pessoa.getNome());
	 }
	 
}
