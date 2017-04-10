package Animais;

public class Zoologico  {

	private Animal[] jaula;  

	public Zoologico(Animal a1, Animal a2, Animal a3, Animal a4, Animal a5) {
		jaula= new Animal[5];
		jaula[0] = a1;
		jaula[1] = a2;
		jaula[2] = a3;
		jaula[3] = a4;
		jaula[4] = a5;
		
	}
	public Animal[] getJaula(){
		return this.jaula;
	}
}
