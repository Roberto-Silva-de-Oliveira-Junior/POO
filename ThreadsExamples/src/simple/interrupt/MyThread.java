package simple.interrupt;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i < 10; i++){
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("fui interrompida!! :(");
				e.printStackTrace();
				return;
			}
		}
	}

}
