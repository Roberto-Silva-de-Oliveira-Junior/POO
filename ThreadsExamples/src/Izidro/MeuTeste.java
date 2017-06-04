package Izidro;
//É melhor implementar Runnable a extender Thread, pois só precisamos do metodos run
public class MeuTeste {

	public static void main(String[] args) {
		
		try {
			ExemploDeThread t1 , t2;
			
			t1 = new ExemploDeThread (1,10,500);
			t2 = new ExemploDeThread(2,10,800);
			Thread thread1 =new  Thread(t1);
			Thread thread2 =new  Thread(t2);
			thread1.start();
			thread2.start();
			
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println("Deu ruim no main"+e.getMessage());
		}
		System.out.println("Terminei");

	}

}
