package Questao08;

public class Funcionario extends Pessoa{
	protected float salario;
	
	public Funcionario(String nome,Data nascimento,float salario){
		super(nome,nascimento);
		this.salario=salario;
	}
	public float calculaImposto(){
		return (float) (salario*0.03);
	}
	public void imprimeDados(){
		System.out.println("\nNome: "+super.nome+"\nNascimento: "+super.nascimento+
				"\nSalario: "+this.salario+"\nImposto: "+calculaImposto());;
	}
}
