package ExemploAyla;

import java.util.LinkedList;
import java.util.List;

public class Produtor implements Runnable {
	private List<String> palavras = new LinkedList<String>();
	private boolean ligado = false;
	private int cont=0;
	
	public void run(){
		ligado = true;
		while(ligado){
			geraPalavra();
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.getMessage();
			}
		}
	}
	public void desligar(){
		synchronized (palavras){
			this.ligado = false;
			System.out.println("Terminando com contador: "+ cont);
		}
	}
	public void geraPalavra(){
		synchronized (palavras){
			this.palavras.add("Palavras: "+cont);
			System.out.println("Gerou palavras número: "+cont);
			cont++;
			palavras.notifyAll();
		}
	}
	public String consumirPalavra(){
		System.out.println("Vou consumir palavra: ");
		synchronized(palavras){
			while(this.palavras.size()==0){
				try {
					palavras.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			String palavra = this.palavras.remove(0);
			return palavra;
		}
	}
	
}
