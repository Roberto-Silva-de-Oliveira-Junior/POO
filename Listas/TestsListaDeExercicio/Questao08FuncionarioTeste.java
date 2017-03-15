import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import questao08.Data;
import questao08.Funcionario;
import questao08.Gerente;

public class Questao08FuncionarioTeste {
	Data data;
	@Before
	public void setUp() throws Exception {	
		data = new Data(23,07,1997);
	}

	@Test
	public void DeveriaCalculadoOImpostoDeUmFuncionarioNormal() {
	Funcionario	func = new Funcionario("Roberto Júnior",data,10000);
	assertEquals(300,func.calculaImposto(),0.001);
	}
	@Test
	public void DeveriaCalculadoOImpostoDeUmGerente() {
	Funcionario func2 = new Gerente("Roberto Júnior",data,10000,"RH");
	assertEquals(500,func2.calculaImposto(),0.001);
	}
	

}
