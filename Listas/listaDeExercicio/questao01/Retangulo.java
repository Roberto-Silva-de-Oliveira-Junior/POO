package questao01;

public class Retangulo {
	private double largura;
	private double altura;
	
	public Retangulo(){
		this.largura=0;
		this.altura=0;
	}
	public Retangulo(double largura, double altura){
		this.largura=largura;
		this.altura=altura;
	}
	public String toString(){
		return "Largura = "+this.largura+"\nAltura = "+this.altura;
		
	}
	public boolean equals(Object obj){
		if(obj ==  null){
			return false;
		}else if(obj instanceof Retangulo){
			Retangulo r1 = (Retangulo) obj;
			if(r1.getLargura()==this.largura && r1.getAltura()==this.altura){
				return true;
			}
		}
		return false;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	public void setLargura(double largura){
		this.largura = largura;
	}
	public double getAltura(){
		return this.altura;
	}
	public double getLargura(){
		return this.largura;
	}
	public double calculaPerimetro(){
		return (this.largura*2)+(this.altura*2);
	}
	public double calulaArea(){
		return (this.largura*this.altura);
	}
	
}
