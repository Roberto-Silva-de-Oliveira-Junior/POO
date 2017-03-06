package Questao03;

public class MainTestaQuestao03 {

	public static void main(String[] args) {
		Poligono poligono = new Poligono();
		try {
			poligono.adicionaPonto(1.0,1.0);
			poligono.adicionaPonto(1.0,-1.0);
			poligono.adicionaPonto(-1.0,-1.0);
			poligono.adicionaPonto(-1.0,1.0);
		} catch (PontoJaExisteException e) {
			e.getMessage();
		}
		
		System.out.println(poligono.toString());
		System.out.println("\n¡rea "+Math.abs(poligono.areaDoPoligono()));
		poligono.removePonto(1.0, 1.0);
		System.out.println(poligono.toString());
	}

}
