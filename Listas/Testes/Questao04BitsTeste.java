import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import questao04.Bits;
import questao04.TamanhosDiferentesException;


public class Questao04BitsTeste {
	Bits bits;
	@Before
	public void setUp() throws Exception {
		bits = new Bits(2); 
		boolean [] bits1 = new boolean[]{false,true};
		bits.setBits(bits1);
		
	}

	@Test
	public void testAnd() {
		try {
			boolean [] bits2 = new boolean[]{false,true};
			bits.and(bits2);
			Bits teste = new Bits(2);
			boolean [] expect = new boolean[]{false,true};
			teste.setBits(expect);
			assertEquals(teste.toString(),bits.toString());
		} catch (TamanhosDiferentesException e) {
			
			e.printStackTrace();
		}
		
	}

	@Test
	public void testOr()  {
		boolean [] bits2 = new boolean[]{false,true};
		try {
			bits.or(bits2);
			Bits teste = new Bits(2);
			boolean [] expect = new boolean[]{false,true};
			teste.setBits(expect);
			assertEquals(teste.toString(),bits.toString());
		} catch (TamanhosDiferentesException e) {
			e.getMessage();
		}
		
	}

	@Test
	public void testNot() {
		bits.not();
		Bits teste = new Bits(2);
		boolean [] expect = new boolean[]{true,false};
		teste.setBits(expect);
		assertEquals(teste.toString(),bits.toString());
		
	}

}
