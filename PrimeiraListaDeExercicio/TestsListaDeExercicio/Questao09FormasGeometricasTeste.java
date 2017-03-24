import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import questao09.Circulo;
import questao09.FormasGeometricas;
import questao09.Quadrado;
import questao09.Retangulo;

public class Questao09FormasGeometricasTeste {
	static FormasGeometricas q1;
	static FormasGeometricas q2;
	static FormasGeometricas c1;
	@BeforeClass
	public static void onlyOnce()  {
		q1 = new Quadrado(2.0,2.0,2.0,2.0);
		q2 = new Retangulo(2.0,2.0,4.0,4.0);
		c1 = new Circulo (2);
	}
	@Test
	public void DeveriaCalcularAreaDoQuadrado() {
		assertEquals(4.0,q1.calculaArea(),0.001);
	}
	@Test
	public void DeveriaCalcularAreaDoRetangulo() {
		assertEquals(8.0,q2.calculaArea(),0.001);
	}
	@Test
	public void DeveriaCalcularAreaDoCirculo() { 
		assertEquals(12.56,c1.calculaArea(),0.01);
	}
	@Test
	public void DeveriaCalcularPerimetroDoQuadrado() {
		assertEquals(8,q1.calculaPerimetro(),0.001);
	}
	@Test
	public void DeveriaCalcularPerimetroDoRetangulo() {
		assertEquals(12.0,q2.calculaPerimetro(),0.001);
	}
	@Test
	public void DeveriaCalcularPerimetroDoCirclo() {
		assertEquals(12.56,c1.calculaPerimetro(),0.01);
	}

}
