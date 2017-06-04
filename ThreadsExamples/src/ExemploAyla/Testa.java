package ExemploAyla;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testa {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Produtor prod = new Produtor();
		Thread pThrecad = new Thread(prod);
		Consumidor con1 = new Consumidor("Con1", prod);
		Consumidor con2 = new Consumidor("Con2", prod);
		Thread cThread1 = new Thread(con1);
		Thread cThread2 = new Thread (con2);
		cThread1.start();
		cThread2.start();
		try {
			cThread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(_________, con1.getUltimaPalavra());
		prod.desligar();
		
	}

}
