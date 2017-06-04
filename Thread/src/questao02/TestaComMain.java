package questao02;

public class TestaComMain {
	public static void main(String[] args) {
		int soma=0;
		int x = 1000;
		int y = 1000;
		int ind = x/10;
		int[][] num = new int[x][y];
	
		for (int k = 0; k < num.length; k++) {
			for (int i = 0; i < num[k].length; i++) {
				num[k][i] = 1;
			}
		}
		ThreadSomadora t1 = new ThreadSomadora(ind-ind,ind,num);
		Thread t11 = new Thread(t1);
		t11.start();
		try {
			t11.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		soma+=t1.getSoma();
		System.out.println(soma);
	}

}
