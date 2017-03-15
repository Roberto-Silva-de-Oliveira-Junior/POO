package questao08;

public class Gerente extends Funcionario {
	private String area;

	public Gerente(String nome, Data nascimento, float salario, String area) {
		super(nome, nascimento, salario);
		this.area = area;
	}

	public float calculaImposto() {
		return (float) (super.salario * 0.05);
	}

	public void imprimeDados() {
		System.out.println("\nNome: " + super.nome + "\nNascimento: " + super.nascimento + "\nSalario: " + super.salario
				+ "\n¡rea: " + this.area+"\nImposto: "+calculaImposto());
		;
	}
}
