package questao02;

public class TestaComMain {
	public static void main(String[] args) {
		int soma=0;
		int x = 10;
		int y = 10;
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
		System.out.println(t1.getSoma());
		ThreadSomadora t2 = new ThreadSomadora(ind+1,2*ind,num);
		Thread t12 = new Thread(t1);
		t12.start();
		soma+=t2.getSoma();
		ThreadSomadora t3 = new ThreadSomadora((2*ind)+1,3*ind,num);
		Thread t13 = new Thread(t1);
		t13.start();
		soma+=t3.getSoma();
		ThreadSomadora t4 = new ThreadSomadora((3*ind)+1,4*ind,num);
		Thread t14 = new Thread(t1);
		t14.start();
		soma+=t4.getSoma();
		ThreadSomadora t5 = new ThreadSomadora((4*ind)+1,5*ind,num);
		Thread t15 = new Thread(t1);
		t15.start();
		soma+=t5.getSoma();
		ThreadSomadora t6 = new ThreadSomadora((5*ind)+1,6*ind,num);
		Thread t16 = new Thread(t1);
		t16.start();
		soma+=t6.getSoma();
		ThreadSomadora t7 = new ThreadSomadora((6*ind)+1,7*ind,num);
		Thread t17 = new Thread(t1);
		t17.start();
		soma+=t7.getSoma();
		ThreadSomadora t8 = new ThreadSomadora((7*ind)+1,8*ind,num);
		Thread t18 = new Thread(t1);
		t18.start();
		soma+=t8.getSoma();
		ThreadSomadora t9 = new ThreadSomadora((8*ind)+1,9*ind,num);
		Thread t19 = new Thread(t1);
		t19.start();
		soma+=t9.getSoma();
		ThreadSomadora t10 = new ThreadSomadora((9*ind)+1,10*ind,num);
		Thread t110 = new Thread(t1);
		t110.start();
		soma+=t10.getSoma();
		
		System.out.println(soma);
	}

}
