import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import questao02.Pessoa;

public class Questao02PessoaTeste {
	Pessoa p;
	@Before
	public void setUp() throws Exception {
		p= new Pessoa("Dio",19,1.70,75,"Masculino");
		//             nome/idade/altura/peso/sexo
	}

	@Test
	public void deveriaCalcularOIMC() {
		Assert.assertEquals(25.9,p.calculaIMC(),0.1);
	}

}
