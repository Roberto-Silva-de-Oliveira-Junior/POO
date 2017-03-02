import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Questao08.Data;
import Questao08.Funcionario;
import Questao08.Gerente;

public class Questao08FuncionarioTeste {
	@Before
	public void setUp() throws Exception {	
	}

	@Test
	public void DeveriaCalculadoOImpostoDeUmFuncionarioNormal() {
	Data data = new Data(23,07,1997);
	Funcionario	func = new Funcionario("Roberto Júnior",data,10000);
	assertEquals(300,func.calculaImposto(),0.001);
	}
	@Test
	public void DeveriaCalculadoOImpostoDeUmGerente() {
	Data data = new Data(23,07,1997);
	Funcionario func2 = new Gerente("Roberto Júnior",data,10000,"RH");
	assertEquals(500,func2.calculaImposto(),0.001);
	}
	

}
