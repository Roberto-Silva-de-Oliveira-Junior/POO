package questao02;

public class TestaComMain {
	public static void main(String[] args) {
		int soma=0;
		int x = 100;
		int y = 100;
		int ind = x/10;
		int[][] num = new int[x][y];
	
		for (int k = 0; k < num.length; k++) {
			for (int i = 0; i < num[k].length; i++) {
				num[k][i] = 2;
			}
		}
		ThreadSomadora t1 = new ThreadSomadora(ind-ind,ind,num);
		Thread t11 = new Thread(t1);
		t11.start();
		try {
			t11.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		soma+=t1.getSoma();
		
		ThreadSomadora t2 = new ThreadSomadora(ind+1,2*ind,num);
		Thread t12 = new Thread(t1);
		t12.start();
		try {
			t12.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		soma+=t2.getSoma();
		ThreadSomadora t3 = new ThreadSomadora((2*ind)+1,3*ind,num);
		Thread t13 = new Thread(t1);
		t13.start();
		try {
			t13.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		soma+=t3.getSoma();
		ThreadSomadora t4 = new ThreadSomadora((3*ind)+1,4*ind,num);
		Thread t14 = new Thread(t1);
		t14.start();
		try {
			t14.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		soma+=t4.getSoma();
		ThreadSomadora t5 = new ThreadSomadora((4*ind)+1,5*ind,num);
		Thread t15 = new Thread(t1);
		t15.start();
		try {
			t15.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		soma+=t5.getSoma();
		ThreadSomadora t6 = new ThreadSomadora((5*ind)+1,6*ind,num);
		Thread t16 = new Thread(t1);
		t16.start();
		try {
			t16.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		soma+=t6.getSoma();
		ThreadSomadora t7 = new ThreadSomadora((6*ind)+1,7*ind,num);
		Thread t17 = new Thread(t1);
		t17.start();
		try {
			t17.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		soma+=t7.getSoma();
		ThreadSomadora t8 = new ThreadSomadora((7*ind)+1,8*ind,num);
		Thread t18 = new Thread(t1);
		t18.start();
		try {
			t18.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		soma+=t8.getSoma();
		ThreadSomadora t9 = new ThreadSomadora((8*ind)+1,9*ind,num);
		Thread t19 = new Thread(t1);
		t19.start();
		try {
			t19.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		soma+=t9.getSoma();
		ThreadSomadora t10 = new ThreadSomadora((9*ind)+1,10*ind,num);
		Thread t110 = new Thread(t1);
		t110.start();
		try {
			t110.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		soma+=t10.getSoma();
		
		System.out.println(soma);
	}

}
