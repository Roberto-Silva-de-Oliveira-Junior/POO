package questao09;

public class Quadrado extends Quadrilateros {
	private double lado;
	public Quadrado(double lado1, double lado2, double lado3,double lado4){
		super(lado1,lado2,lado3,lado4);
		this.lado=lado1;
	}
	@Override
	public double calculaArea() {
		return this.lado*this.lado;
	}
}
