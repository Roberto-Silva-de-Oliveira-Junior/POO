import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Questao04.Bits;
import Questao04.TamanhosDiferentesException;


public class Questao04BitsTeste {
	Bits bits;
	@Before
	public void setUp() throws Exception {
		bits = new Bits(2); 
		boolean [] bits1 = new boolean[]{false,true};
		bits.setBits(bits1);
		
	}

	@Test(expected = TamanhosDiferentesException.class)
	public void testAnd() throws TamanhosDiferentesException{
		boolean [] bits2 = new boolean[]{false,true};
		bits.and(bits2);
		Bits teste = new Bits(2);
		boolean [] expect = new boolean[]{false,true};
		teste.setBits(expect);
		assertEquals(teste.toString(),bits.toString());
	}

	@Test(expected = TamanhosDiferentesException.class)
	public void testOr() throws TamanhosDiferentesException {
		boolean [] bits2 = new boolean[]{false,true};
		bits.or(bits2);
		Bits teste = new Bits(2);
		boolean [] expect = new boolean[]{false,true};
		teste.setBits(expect);
		assertEquals(teste.toString(),bits.toString());
	}

	@Test
	public void testNot() {
		boolean [] bits2 = new boolean[]{true,true};
		bits.not(bits2);
		Bits teste = new Bits(2);
		boolean [] expect = new boolean[]{false,false};
		teste.setBits(expect);
		assertEquals(teste.toString(),bits.toString());
		
	}

}
