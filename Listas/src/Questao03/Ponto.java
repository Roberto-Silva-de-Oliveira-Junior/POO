package Questao03;

public class Ponto {
	protected double x;
	protected double y;
	
	public Ponto (double x, double y){
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}else if(obj instanceof Ponto){
			Ponto poligono = (Ponto) obj; 
			if(poligono.getX()==this.x&&poligono.getY()==y){
				return true;
			}
		}
		return false;
	}
	public String toString(){
		return "\nX = "+this.x+" Y = "+this.y; 
	}
	
	
}
