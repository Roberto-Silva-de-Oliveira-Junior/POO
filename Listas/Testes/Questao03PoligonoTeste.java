import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Questao03.Poligono;
import Questao03.Ponto;
import Questao03.PontoJaExisteException;


public class Questao03PoligonoTeste {
	Poligono p;
	@Before
	public void setUp() throws Exception {
		p = new Poligono();
	}

	@Test(expected = PontoJaExisteException.class)
	public void testAdcionaPonto() throws Exception {
		p.adicionaPonto(2,3);
		Ponto ponto = new Ponto(2,3);
		for(Ponto p3: p.acessaConjuntoDePontos()){
			if(p3.getX() == ponto.getX() && p3.getY() == ponto.getY()){
				throw new PontoJaExisteException("Ponto já existe,impossivel adicionar.");
			}
		}
	}
	
	@Test
	public void testRemovePonto() {
		p.adicionaPonto(2,3);
		Ponto ponto = new Ponto(2,3);
		Assert.assertTrue((p.removePonto(ponto)));
	}
	
	@Test
	public void testAcessaConjuntoDePontos() {
		ArrayList<Ponto> ad = new ArrayList<Ponto>();
		Ponto p1 = new Ponto(2,3);
		ad.add(p1);
		p.adicionaPonto(2,3);
		Assert.assertEquals(ad, p.acessaConjuntoDePontos());
	}

	@Test
	public void testAreaDoPoligono() {
		p.adicionaPonto(2,3);
		p.adicionaPonto(2,6);
		p.adicionaPonto(3,4);
		p.adicionaPonto(10, 20);
		Assert.assertEquals(8,p.areaDoPoligono(),0.01);
	}

}
