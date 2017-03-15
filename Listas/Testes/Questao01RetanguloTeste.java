import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import questao01.Retangulo;

public class Questao01RetanguloTeste {
	
	Retangulo m;
	@Before
	public void setUp() throws Exception {
		m = new Retangulo(2,4);
	}

	@Test
	public void testCalculaPerimetro() {
		Assert.assertEquals(12,m.calculaPerimetro(),0.001);
	}

	@Test
	public void testCalulaArea() {
		Assert.assertEquals(8,m.calulaArea(),0.001);
	}

}
