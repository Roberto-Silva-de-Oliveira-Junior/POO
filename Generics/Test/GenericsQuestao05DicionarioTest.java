import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import questao05.Dicionario;

public class GenericsQuestao05DicionarioTest {
	Dicionario<Integer, String> d1;
	
	@Before
	public void setUp() throws Exception {
		d1 = new Dicionario<Integer,String>();
		d1.add(0, "oi");
		d1.add(1, "tchau");
	}

	@Test
	public void testAdd() {
		assertEquals(d1.getQtdeDeElementos(),2);
	}

	@Test
	public void testGetValue() {
		assertEquals("tchau",d1.getValue(1));
	}

}
