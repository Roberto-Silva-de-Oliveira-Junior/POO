package simple.join;

import simple.interrupt.MyThread;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
		t1.start();
		
		t1.join();	//main, espere t1 terminar sua execuçao
		System.out.println("t1 acabou!, esperei a thread acabar, pronto :v");
		
	}

}
