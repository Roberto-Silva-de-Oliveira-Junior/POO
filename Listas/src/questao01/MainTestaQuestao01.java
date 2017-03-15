package questao01;

public class MainTestaQuestao01 {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo(2,5);
		System.out.println("Retangulo 1\n"+r1.toString()+"\nRetangulo 2\n"+r2.toString());
		r1.setLargura(2);
		r1.setAltura(5);
		System.out.println("Novas dimenções do primeiro retangulo :"+
		r1.getAltura()+" X "+r1.getLargura());
		igualdade(r1,r2);
		System.out.println("Perimetros:"+"\nRetangulo 1: "+r1.calculaPerimetro()+
		"\nRetangulo 2: "+r2.calculaPerimetro()+"\nÁrea:"+"\nRetangulo 1: "+r1.calulaArea()
		+"\nRetangulo 2 :"+r2.calulaArea());

	}
	public static void igualdade(Retangulo r1, Retangulo r2){
		if (r1.equals(r2)) {
			System.out.println("Os retangulos são iguais.");
		}else{
			System.out.println("Os retangulos não são iguais.");
		}
	}
}