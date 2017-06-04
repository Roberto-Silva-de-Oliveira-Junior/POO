package questao01;

public class MainTestaThread {
	public static void main(String[] args){
		ImprimiComThread i = new ImprimiComThread();
		Thread t  = new Thread(i);
		t.start();
	}
}
