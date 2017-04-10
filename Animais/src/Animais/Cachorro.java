package Animais;

public class Cachorro extends Animal{
	public Cachorro(String nome, int idade){
		super.nome=nome;
		super.idade=idade;
	}
	public void correr(){
		System.out.println(super.nome+" Corre, corre,cachorrinho :)");
	}
	public void emitirSom(){
		System.out.println("AU,Au,AU");
	}
}
