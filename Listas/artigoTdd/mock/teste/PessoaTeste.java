package mock.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTeste {
	/**
	@Test
	public void deveriaCriarUmLogQuandoUmaPessoaForExcluida()throws Exception{
		Pessoa  pessoa = new Pessoa();
		pessoa.setNome("Alexandre");
		PessoaController pessoaController = new PessoaController();
		pessoaController.exclui(pessoa);
		
		
	}
	**/
	@Test
	public void deveriaCriarUmLogQuandoUmaPessoaForExcluida() throws Exception{
		Pessoa pessoa = new Pessoa();
		pessoa. setNome("Alexandre");
		LogMock nossoLogMock = new LogMock();
		PessoaController pessoaController = new PessoaController (nossoLogMock);
		pessoaController.exclui(pessoa);
		assertEquals(pessoa.getNome(),nossoLogMock.getNome());
		
	}
}
