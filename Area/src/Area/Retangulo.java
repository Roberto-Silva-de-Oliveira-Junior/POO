package Area;

public class Retangulo implements AreaCalculavel {
	private double altura;
	private double comprimento;

	public Retangulo(double altura, double comprimento) {
		this.altura = altura;
		this.comprimento = comprimento;
	}

	@Override
	public double calculaArea() {
		return this.altura * this.comprimento;
	}

	@Override
	public double CalculaPerimetro() {
		return 2 * this.altura + 2 * this.comprimento;
	}

	public String toString() {
		return "Retangulo com altura = " + this.altura + "\nE comprimento = " + this.comprimento;
	}

	public boolean eguals(Object o) {
		if (o == null) {
			return false;
		} else if (o instanceof Retangulo) {
			Retangulo r1 = (Retangulo) o;
			if (r1.getAltura() == this.altura && r1.getComprimento() == this.comprimento) {
				return true;
			}
		}
		return false;
	}

	public double getAltura() {
		return altura;
	}

	public double getComprimento() {
		return comprimento;
	}

}
