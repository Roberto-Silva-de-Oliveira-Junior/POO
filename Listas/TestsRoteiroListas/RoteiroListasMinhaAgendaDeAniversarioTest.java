import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import roteiroListas.Aniversariante;
import roteiroListas.MinhaAgendaDeAniversarios;

public class RoteiroListasMinhaAgendaDeAniversarioTest {
	MinhaAgendaDeAniversarios m;
	@Before
	public void setUp() throws Exception {
		m = new MinhaAgendaDeAniversarios();
		m.adcionarAniversariante("Roberto", 23,07, 1997);
	}

	@Test
	public void testAdcionarAniversariante() {
		List<Aniversariante> a = m.getAniversariantes();
		assertEquals(1,a.size());
		
	}

	@Test
	public void testObterAniversariantesDoMes() {
		List<String> a = m.obterAniversariantesDoMes(07);
		String nome ="";
		for(String c: a){
			if(c=="Roberto"){
				nome = c;
			}
		}
		assertEquals("Roberto",nome);
	}

	@Test
	public void testRemoverAniversariantes() {
		m.removerAniversariantes("Roberto");
		assertEquals(0,m.obterAniversariantesDoMes(07).size());
	}

}
