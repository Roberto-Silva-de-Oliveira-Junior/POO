package roteiroListas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
	private List<Aniversariante> aniversariantes;
	
	public MinhaAgendaDeAniversarios(List<Aniversariante> aniversariantes){
		this.aniversariantes = aniversariantes;
	}
	public MinhaAgendaDeAniversarios(){
		aniversariantes = new ArrayList<Aniversariante>();
	}
	public List<Aniversariante> getAniversariantes(){
		return this.aniversariantes;
	}
	public void adcionarAniversariante(String nome, int dia, int mes, int ano){
		Aniversariante a1 = new Aniversariante(nome, dia, mes, ano);
		aniversariantes.add(a1);
	}
	public ArrayList<String> obterAniversariantesDoMes(int mes){
		ArrayList<String> aniversariatesDoMes = new ArrayList<String>();
		for(Aniversariante a : this.aniversariantes){
			if(a.ehAniversarianteDoMes(mes)){
				aniversariatesDoMes.add(a.getNome());
			}
		}
		return aniversariatesDoMes;
	}
	public void removerAniversariantes(String nomeAniversariante){
		Iterator <Aniversariante> i = aniversariantes.iterator();
		while(i.hasNext()){
			Aniversariante a = i.next();
			if(a.getNome().equals(nomeAniversariante)){
				i.remove();
			}
		}
		
	}
}
