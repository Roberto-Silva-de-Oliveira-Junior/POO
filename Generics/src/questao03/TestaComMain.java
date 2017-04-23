package questao03;

public class TestaComMain {
	public static void main(String[]args){
		Codigo<String,Integer> codigo = new Codigo<String,Integer>("SEC",1413);
		ProdutoGenerico<Codigo<String,Integer>> PG = new ProdutoGenerico<Codigo<String,Integer>>
		(codigo,"Muito Importante, CUIDADO",500.0);
		System.out.println(PG.toString());
	}

}
