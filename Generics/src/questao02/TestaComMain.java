package questao02;

public class TestaComMain {
	public static void main(String[]args){
		
		Codigo codigo = new Codigo("SEC1413");
		ProdutoGenerico<Codigo> PG = new ProdutoGenerico<Codigo>
		(codigo,"Muito Importante, CUIDADO",500.0);
		System.out.println(PG.toString());
	}

}
