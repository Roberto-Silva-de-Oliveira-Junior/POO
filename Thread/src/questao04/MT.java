package questao04;

//Qual a sa�da produzida pela execu��o do c�digo abaixo?
//e) A sa�da n�o pode ser determinada
public class MT implements Runnable {
	String ms = "S ";

	@Override
	public void run() {
		this.ms = "N ";
	}

	public static void main(String[] args) {
		MT t = new MT();
		new Thread(t).start();
		for (int k = 0; k < 10; k++) {
			System.out.println(t.ms);
		}
	}
}
