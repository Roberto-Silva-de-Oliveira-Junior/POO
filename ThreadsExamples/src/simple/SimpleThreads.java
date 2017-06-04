package simple;

public class SimpleThreads {

	// Display a message, preceded by
	// the name of the current thread
	public static void threadMessage(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}

	public static void main(String args[]) throws InterruptedException {

		long patience = 1000 * 10;	//10 segundos

		threadMessage("Starting MessageLoop thread");
		long startTime = System.currentTimeMillis();
		
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		threadMessage("Waiting for MessageLoop thread to finish");
		// executa até a thread MessageLoop terminar
		while (t.isAlive()) {
			threadMessage("Still waiting...");
			// espera 1 segundo, e se nossa paciencia tiver esgotado nós terminamos MessageLoop 
			t.join(1000);
			if (((System.currentTimeMillis() - startTime) > patience)
					&& t.isAlive()) {
				threadMessage("Tired of waiting!");
				t.interrupt();
				// interrompemos e esperamos a thread acabar de fato
				t.join();
			}
		}
		threadMessage("Finally!");
	}
}
