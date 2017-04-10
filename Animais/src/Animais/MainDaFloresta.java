package Animais;

public class MainDaFloresta {

	public static void main(String[] args) {
		Cachorro Cachorro = new Cachorro("Bilú", 12);
		Cavalo Cavalo = new Cavalo("Zeus", 4);
		Preguica Preguica = new Preguica("Zázá", 16);
		Zoologico z1 = new Zoologico(Cachorro,Cavalo,Preguica,null,null);
		
		for(int k=0;k<z1.getJaula().length;k++){
			if(z1.getJaula()[k]!=null){
				z1.getJaula()[k].emitirSom();
				if(z1.getJaula()[k] instanceof Cachorro){
					Cachorro Cachorro1 = (Cachorro)z1.getJaula()[k];
					Cachorro1.correr();
				}else if(z1.getJaula()[k] instanceof Cavalo){
					Cavalo Cavalo1 = (Cavalo)z1.getJaula()[k];
					Cavalo1.correr();
				}
				else if(z1.getJaula()[k] instanceof Preguica){
					Preguica Preguica2 = (Preguica)z1.getJaula()[k];
					Preguica2.escalarArvore();
				}
			}
		}

	}

}
