package questao03;

public class ProdutoGenerico<T> {
	private T codigo;
	private String descricao;
	private double preco;

	public ProdutoGenerico(T cod,String descr, double pr) {
		codigo = cod;
		descricao = descr;
		preco = pr;
	}

	public T getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
	return "ProdutoG{" + "Codigo = " + codigo + ",descricao = " +
	descricao + ",preco = " + preco + "}";
	}
}
