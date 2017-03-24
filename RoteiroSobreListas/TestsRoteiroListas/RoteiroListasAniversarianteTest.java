import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import roteiroListas.Aniversariante;

public class RoteiroListasAniversarianteTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ehAniversarianteDoMesTest() {
		Aniversariante a1 = new Aniversariante ("Roberto",23,12,1997);
		Aniversariante a2 = new Aniversariante ("Roberto",23,10,1997);
		assertTrue(a1.ehAniversarianteDoMes(12));
		assertFalse(a2.ehAniversarianteDoMes(12));
	}
	

}
