package Area;

public class Circulo implements AreaCalculavel {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * (this.raio * this.raio);
	}

	@Override
	public double CalculaPerimetro() {
		return 2 * Math.PI * this.raio;
	}

	public String toString() {
		return "Circulo com raio = " + this.raio;
	}

	public boolean eguals(Object o) {
		if (o == null) {
			return false;
		} else if (o instanceof Circulo) {
			Circulo c1 = (Circulo) o;
			if (c1.getRaio() == this.raio) {
				return true;
			}
		}
		return false;
	}

	public double getRaio() {
		return raio;
	}
}
