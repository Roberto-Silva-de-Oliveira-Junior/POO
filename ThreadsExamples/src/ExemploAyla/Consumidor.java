package ExemploAyla;

public class Consumidor implements Runnable {
	private Produtor produtor;
	private String nome;
	private String ultimaPalavra =null;
	
	public Consumidor(String n , Produtor produtor){
		this.nome=n;
		this.produtor=produtor;
	}
	public void run(){
		this.ultimaPalavra = produtor.consumirPalavra();
		System.out.println("["+nome+"]-->recebi: "+ultimaPalavra);
	}
	public String getUltimaPalavra(){
		return this.ultimaPalavra;
	}
	

}
