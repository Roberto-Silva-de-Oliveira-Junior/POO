package Questao03;

import java.util.ArrayList;

public class Poligono {
	private ArrayList<Ponto> conjuntoDePontos;

	public Poligono() {
		conjuntoDePontos = new ArrayList<Ponto>();
	}

	public void adicionaPonto(double x, double y) {
		Ponto p1 = new Ponto(x, y);
		conjuntoDePontos.add(p1);
	}

	public boolean removePonto(double x, double y){
		for (Ponto c : conjuntoDePontos) {
			if (c.x == x && c.y == y) {
				conjuntoDePontos.remove(c);
				return true;
			}
		}
		System.out.println("Esse Ponto não existe no poligono");
		return false;
	}

	public ArrayList<Ponto> acessaConjuntoDePontos() {
		return this.conjuntoDePontos;
	}

	public String toString() {
		String pontos = "";
		for (Ponto c : conjuntoDePontos) {
			pontos +=c.toString();
		}
		return pontos;
	}

	public double areaDoPoligono() {
		double soma = 0;
		for (int k = 0; k < conjuntoDePontos.size() - 1; k++) {
			soma += conjuntoDePontos.get(k + 1).getY() * conjuntoDePontos.get(k).getX()
					- conjuntoDePontos.get(k + 1).getX() * conjuntoDePontos.get(k).getY();
		}
		return (soma);
	}
}
