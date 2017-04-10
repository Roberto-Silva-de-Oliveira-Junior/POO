package Animais;

public class Cavalo extends Animal{
	public Cavalo(String nome, int idade){
		super.nome=nome;
		super.idade=idade;
	}
	public void correr(){
		System.out.println(super.nome+" Corre,Corre cavalinho:v");
	}
	public void emitirSom() {
		System.out.println("NhenRUmRUmRUMRUm");	
	}
	
	 
}
