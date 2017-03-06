package Questao03;

import java.util.ArrayList;

public class Poligono {
	private ArrayList<Ponto> conjuntoDePontos;

	public Poligono() {
		conjuntoDePontos = new ArrayList<Ponto>();
	}

	public void adicionaPonto(double x, double y) throws PontoJaExisteException {
		Ponto p1 = new Ponto(x, y);
		if(pontoExistente(p1)){
			throw new PontoJaExisteException("Impossivel adcionar, pois esse ponto já existe");
		}
		conjuntoDePontos.add(p1);
	}
	public boolean pontoExistente(Ponto p){
		for(Ponto c: conjuntoDePontos){
			if(p.equals(c)){
				return true;
			}
		}
		return false;
		
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
		int tamanho = conjuntoDePontos.size();
		double soma = 0;
		for (int k = 0; k < conjuntoDePontos.size() - 1; k++) {
			soma += (conjuntoDePontos.get(k + 1).getY() * conjuntoDePontos.get(k).getX()
					- conjuntoDePontos.get(k + 1).getX() * conjuntoDePontos.get(k).getY())/2;
		}
		soma =(conjuntoDePontos.get(0).getY() * conjuntoDePontos.get(tamanho-1).getX()
				- conjuntoDePontos.get(0).getX() * conjuntoDePontos.get(tamanho-1).getY())/2;
		
		return (soma);
	}
}
