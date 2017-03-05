package Questao03;

public class MainTestaQuestao03 {

	public static void main(String[] args) {
		Poligono poligono = new Poligono();
		poligono.adicionaPonto(3.0, 4.0);;
		poligono.adicionaPonto(5, 7);
		System.out.println(poligono.toString());
		System.out.println("\n¡rea "+poligono.areaDoPoligono());
		poligono.removePonto(5.0, 7.0);
		System.out.println(poligono.toString());
	}

}
