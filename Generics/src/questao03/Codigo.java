package questao03;

public class Codigo <T,N>{
	private T codigoParte1;
	private N codigoParte2;
	
	public Codigo(T cod1, N cod2){
		this.codigoParte1 = cod1;
		this.codigoParte2 = cod2;
	}

	public Codigo<T,N> getCodigo() {
		return new Codigo<T,N>(codigoParte1,codigoParte2);
	}

	public void setCodigo(T cod1, N cod2) {
		this.codigoParte1 = cod1;
		this.codigoParte2 = cod2;
	}
	public String toString(){
		return this.codigoParte1+""+this.codigoParte2;
	}

}
