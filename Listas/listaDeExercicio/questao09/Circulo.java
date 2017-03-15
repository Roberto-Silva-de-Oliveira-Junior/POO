package questao09;

public class Circulo implements FormasGeometricas{
	protected double raio;
	
	public Circulo(double raio){
		this.raio=raio;
	}

	@Override
	public double calculaPerimetro() {
		return 2*Math.PI*this.raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI*(this.raio*this.raio);
	}
	
}
