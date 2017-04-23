package questao01;

public class Par <T,N>{
	private T t;
	private N n;
	public Par(T t, N n){
		this.t=t;
		this.n=n;
	}
	public String toString(){
		return this.t+"\n"+this.n;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public N getN() {
		return n;
	}
	public void setN(N n) {
		this.n = n;
	}
	

}
