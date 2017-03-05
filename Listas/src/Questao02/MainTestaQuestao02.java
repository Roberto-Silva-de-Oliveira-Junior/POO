package Questao02;

public class MainTestaQuestao02 {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Roberto",19,1.75,75,"Masculino");
		System.out.println(pessoa.calculaIMC());
		System.out.println(pessoa.toString());
	}

}
