package Area;

public class Quadrado  implements AreaCalculavel {
	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	@Override
	public double calculaArea() {
		return this.lado*this.lado;
	}
	@Override
	public double CalculaPerimetro(){
		return lado*4;
	}
	public String toString(){
		return "Quadrado com lado = "+this.lado;
	}
	public double getLado(){
		return this.lado;
	}
	public boolean equals(Object o){
		if( o == null){
			return false;
		}else if(o instanceof Quadrado ){
			Quadrado q1 = (Quadrado) o;
			if(q1.getLado()==this.lado){
				return true;
			}
		}
		return false;
		
	}
}
