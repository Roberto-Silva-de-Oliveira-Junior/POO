package Questao09;

public abstract class Quadrilateros implements FormasGeometricas {
	protected double lado1;
	protected double lado2;
	protected double lado3;
	protected double lado4;
	
	public Quadrilateros(double l1, double l2, double l3, double l4){
		this.lado1=l1;
		this.lado2=l2;
		this.lado3=l3;
		this.lado4=l4;
	}
	public double calculaPerimetro(){
		return this.lado1+this.lado2+this.lado3+this.lado4;
	}
}
