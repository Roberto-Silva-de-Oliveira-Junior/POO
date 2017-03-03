package Questao09;

public class Retangulo extends Quadrilateros {
	private double base;
	private double altura;
	
	public Retangulo(double base, double base2,double altura,double altura2){
		super(base,base2,altura,altura2);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return this.base*altura;
	}
	
	
}
