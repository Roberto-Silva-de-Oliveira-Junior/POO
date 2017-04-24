package sistemaBancario;

import java.util.Queue;

public class TestaComMain {
	public static void main(String[] args){
		GerenciadorDeSenhas gS = new GerenciadorDeSenhas(true);
		gS.emitirSenha("Roberto", 19, 123321123);
		gS.emitirSenha("Julio",18,23122312);
		gS.emitirSenha("Mark",50,12332113);
		Queue <Senha>s = gS.getSenhas();
		System.out.println("##:"+s.peek());
	}
}
