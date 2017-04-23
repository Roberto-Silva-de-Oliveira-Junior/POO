package questao01;

public class App {

	public static void main(String[] args) {
		Par<String, Double> p1 = new Par<String, Double>("Roberto",10.0);//Nome e nota de Aluno
		Par<Integer, String> p2 = new Par<Integer, String>(123321,"Roberto");//Codigo e nome de funcionario
		Par<Float,Float> p3 = new Par<Float,Float>(2.0f,3.0f);//Coordenadas (X,Y)
		System.out.println(p1.toString()+"\n"+p2.toString()+"\n"+p3.toString());

	}

}
