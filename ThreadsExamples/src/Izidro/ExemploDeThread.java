package Izidro;

public class ExemploDeThread implements  Runnable{
	private int id;
	private int tempo;
	private int valor;
	
	public ExemploDeThread(int id, int valor, int tempo){
		this.id        = id;
		this.valor   = valor;
		this.tempo = tempo;
	}
	public void run(){
		try{
			for(int i=0;i<this.valor;i++){
				System.out.println("Thread  id:"+this.id+" Valor: "+i);
				Thread.sleep(this.tempo);
			}
		}catch(Exception ex){
			System.out.println("Deu Ruim"+ex.getMessage());
		}
	}
}
