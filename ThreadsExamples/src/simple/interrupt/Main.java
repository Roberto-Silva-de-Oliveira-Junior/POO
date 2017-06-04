package simple.interrupt;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
		t1.start();
		
		Thread.sleep(3000);
		t1.interrupt();
	}

}
