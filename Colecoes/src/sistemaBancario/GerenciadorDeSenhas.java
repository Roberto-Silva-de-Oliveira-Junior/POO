package sistemaBancario;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GerenciadorDeSenhas  {
	private Queue<Senha> senha ;

	public GerenciadorDeSenhas(boolean tipoDePrioridade){
		if(tipoDePrioridade){
			senha = new PriorityQueue<Senha>();//Ordena de acordo com a idade
		}else{
			senha = new LinkedList<Senha>();//Mantem a ordem de inserção, (chegada)
		}
	}
	public void emitirSenha(String nome, int idade, int cpf){
		Senha s = new Senha(nome,idade,cpf);
		System.out.println(s);
		senha.offer(s);
	}
	public Senha proximaSenha(){
		return senha.poll();
	}
	public Queue<Senha> getSenhas (){
		return senha;
	}
	
	
}
