package questao04;

public class TestaComMain {
	public static void main(String[]args){
		Codigo<String,Integer> codigo = new Codigo<String,Integer>("SEC",1413);
		ValorM vM = new ValorM(500.0);
		ProdutoGenerico2<Codigo<String,Integer>,ValorM> PG = new ProdutoGenerico2<Codigo<String,Integer>,ValorM>
		(codigo,"Muito Importante, CUIDADO",vM);
		System.out.println(PG.toString());
	}

}
