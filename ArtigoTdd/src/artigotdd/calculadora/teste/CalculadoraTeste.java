package artigotdd.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {
	@Test
	public void deveriaSomarDoisValoresPassados() throws Exception{
		int a = 1;
		int b = 2;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(a,b);
		assertEquals(3,soma);
	}
	@Test
	public void deveriaSubtrairDoisValoresPassados()throws Exception{
		int a = 1;
		int b = 2;
		Calculadora calculadora = new Calculadora();
		int subtracao = calculadora.subtrai(a,b);
		assertEquals(-1,subtracao);
	}
	@Test
	public void deveriaDividirDoisValoresPassados() throws Exception{
		int a = 6;
		int b = 2;
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divisao(a,b);
		assertEquals(3,divisao);
	}
	@Test(expected = ArithmeticException.class)
	public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero()throws Exception {
		int a = 6;
		int b = 0;
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divisao(a, b);
		assertEquals(0, divisao);
	}

	
	

}
