import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import sistemaBancario.GerenciadorDeSenhas;
import sistemaBancario.Senha;

public class SistemaBancarioTest {
	GerenciadorDeSenhas gS;

	@Before
	public void setUp() throws Exception {
		gS = new GerenciadorDeSenhas(true);
		gS.emitirSenha("Roberto", 19, 123321123);
		gS.emitirSenha("Julio",18,23122312);
		gS.emitirSenha("Mark",50,12332113);
	}
	@Test
	public void testEmitirSenha() {
		assertEquals(gS.getSenhas().size(),3);
	}

	@Test
	public void testProximaSenha() {
		Senha s = new Senha("Mark",50,12332113);
		assertEquals(gS.proximaSenha(),s);
	}

}
