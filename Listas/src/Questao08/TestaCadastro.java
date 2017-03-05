package Questao08;

public class TestaCadastro {
	public static void main(String[] args) {

		Data d1 = new Data(01, 07, 07);
		Cliente c1 = new Cliente("zé", d1, 1);
		Data d2 = new Data(22, 07, 1998);
		Cliente c2 = new Cliente("Maria", d2, 2);
		Data d3 = new Data(13, 12, 1913);
		Cliente c3 = new Cliente("Zuzu", d3, 3);

		Data d4 = new Data(25, 07, 1997);
		Funcionario f1 = new Funcionario("Dio", d4, 100);
		Data d5 = new Data(23, 07, 1997);
		Funcionario f2 = new Funcionario("Dodo", d5, 200);
		Data d6 = new Data(23, 03, 1997);
		Funcionario f3 = new Funcionario("Dédé", d6, 300);

		Data d7 = new Data(25, 07, 1997);// String nome, Data nascimento, float
											// salario, String area
		Gerente g1 = new Gerente("Martin", d7, 100, "RH");
		Data d8 = new Data(22, 07, 1997);
		Gerente g2 = new Gerente("Marcos", d8, 200, "Finanças");
		Data d9 = new Data(22, 07, 1997);
		Gerente g3 = new Gerente("Marcelo", d9, 300, "RH");

		CadastroPessoas cp = new CadastroPessoas();
		cp.cadastraPessoas(c1);
		cp.cadastraPessoas(c2);
		cp.cadastraPessoas(c3);
		cp.cadastraPessoas(f1);
		cp.cadastraPessoas(f2);
		cp.cadastraPessoas(f3);
		cp.cadastraPessoas(g1);
		cp.cadastraPessoas(g2);
		cp.cadastraPessoas(g3);
		cp.imprimeCadastro();
	}

}
