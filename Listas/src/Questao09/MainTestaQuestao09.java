package Questao09;

public class MainTestaQuestao09 {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(2,2,4,4);
		Retangulo r2 = new Retangulo(3,3,6,6);
		Quadrado q1 = new Quadrado(2,2,2,2);
		Quadrado q2 = new Quadrado(3,3,3,3);
		Circulo c1 = new Circulo (2);
		Circulo c2 = new Circulo (3);
		FormasGeometricas [] fG = new FormasGeometricas[6];
		fG[0] = r1;
		fG[1] = r2;
		fG[2] = q1;
		fG[3] = q2;
		fG[4] = c1;
		fG[5] = c2;
		for(FormasGeometricas a : fG){
			if(a instanceof Quadrilateros){
				Quadrilateros c = (Quadrilateros)a;
				if(c.lado1==c.lado3){
					System.out.println("Quadrado");
				}else {
					System.out.println("Retangulo");
				}
				System.out.println("LADOS: "+c.lado1+" "+c.lado2+" "+c.lado3+" "+c.lado4);
				System.out.println(c.calculaPerimetro());
				System.out.println(c.calculaArea());
			}
			else if (a instanceof Circulo){
				Circulo c = (Circulo)a;
				System.out.println("Circulo\nRaio: "+c.raio);
				System.out.println(c.calculaPerimetro());
				System.out.println(c.calculaArea());
			}
		}
		
	}

}
