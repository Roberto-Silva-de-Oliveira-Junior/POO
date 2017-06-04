package questao02;

public class ThreadSomadora implements Runnable {
	private int inicio;
	private int fim;
	private int[][] num;
	int soma = 0;

	public ThreadSomadora(int inicio, int fim, int[][] num) {
		this.inicio = inicio;
		this.fim = fim;
		this.num = num;
	}
	public   synchronized int getSoma(){
		return this.soma;
	}

	@Override
	public void run() {
		for (int k = this.inicio; k < fim; k++) {
			for (int i = this.inicio; i < fim; i++) {
				if(num[k][i]!=0){
					soma++;
				}
			}
		}
	}

}
