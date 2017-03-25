import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import questoesPraticas.AgendaEletronica;
import questoesPraticas.Contato;

public class questoesPraticasAgendaEletronicaTest {
	Contato c1;
	Contato c2;
	Contato c3;
	AgendaEletronica agenda;

	@Before
	public void setUp() throws Exception {
		c1 = new Contato("Zé",01010101,"Zezinho@gmail.com");
		c2 = new Contato("Zefa",02020202,"Zefinha@gmail.com");
		agenda = new AgendaEletronica();
		agenda.addContato(c1);
		agenda.addContato(c2);
		
	}
	
	@Test
	public void testAddContato() {
		c3 = new Contato("Antônio",03030303,"Toin@gmail.com");
		agenda.addContato(c3);
		assertEquals(3,agenda.getContatos().size());
	}

	@Test
	public void testRemoverContatoContato() {
		assertTrue(agenda.removerContato(c2));
	}

	@Test
	public void testRemoverContatoString() {
		agenda.removerContato("Z");
		assertEquals(0,agenda.getContatos().size());
	}

	@Test
	public void testListarContatos() {
		assertEquals(1,agenda.listarContatos("a").size());
	}

}
