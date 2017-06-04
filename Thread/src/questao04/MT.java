package questao04;

//Qual a saída produzida pela execução do código abaixo?
//e) A saída não pode ser determinada
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
