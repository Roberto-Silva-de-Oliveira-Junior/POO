package Animais;

public class Preguica extends Animal{
	public Preguica(String nome, int idade){
		super.nome=nome;
		super.idade=idade;
	}
	public void escalarArvore(){
		System.out.println(super.nome+" Escalando, escalando, sou uma preguiça :V");
	}
	public void emitirSom(){
		System.out.println("ZzZzzzzZz");
	}
}
