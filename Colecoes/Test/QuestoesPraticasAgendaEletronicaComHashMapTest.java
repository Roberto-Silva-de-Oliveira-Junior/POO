 import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import agendaEletronicaComHashMap.AgendaEletronicaComHashMap;
import agendaEletronicaComHashMap.Contato;




public class QuestoesPraticasAgendaEletronicaComHashMapTest {
	Contato c1;
	Contato c2;
	Contato c3;
	AgendaEletronicaComHashMap agenda;
	@Before
	public void setUp() throws Exception {
		c1 = new Contato(01010101,"Zezinho@gmail.com");
		c2 = new Contato(02020202,"Zefinha@gmail.com");
		agenda = new AgendaEletronicaComHashMap();
		agenda.addContato("Zé",c1);
		agenda.addContato("Zefa",c2);
	}
	@Test
	public void testAddContato() {
		c3 = new Contato(03030303,"Toin@gmail.com");
		agenda.addContato("Toin",c3);
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
