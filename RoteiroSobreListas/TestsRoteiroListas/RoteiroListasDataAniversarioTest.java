import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import roteiroListas.DataAniversario;

public class RoteiroListasDataAniversarioTest {
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testEquals() {
		DataAniversario d1 = new DataAniversario(23,07,1997); 
		DataAniversario d2 = new DataAniversario (23,07,1997);
		DataAniversario d3 = new DataAniversario (20,06,1990);
		assertTrue(d1.equals(d2));
		assertFalse(d1.equals(d3));
		assertEquals(d1,d2);
		assertNotEquals(d1,d3);
		
	}
}
