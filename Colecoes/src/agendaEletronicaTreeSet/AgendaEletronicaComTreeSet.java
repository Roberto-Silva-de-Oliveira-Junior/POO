package agendaEletronicaTreeSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import agendaEletronicaTreeSet.Contato;

public class AgendaEletronicaComTreeSet{
	private TreeSet<Contato> treeSetDeContatos;
	
	public TreeSet<Contato> getContatos(){
		return this.treeSetDeContatos;
	}
	public AgendaEletronicaComTreeSet(){
		treeSetDeContatos = new TreeSet<Contato>();
	}
	public void addContato(Contato c){
		treeSetDeContatos.add(c);
	}
	public boolean removerContato(Contato c){
		for(Contato contatos: treeSetDeContatos){
			if(contatos.compareTo(c)==0){
				treeSetDeContatos.remove(c);
				return true;
			}
		}
		return false;
	}
	public void removerContato(String id){
		Iterator <Contato> i = treeSetDeContatos.iterator();
		while(i.hasNext()){
			Contato a = i.next();
			if(a.getNome().toUpperCase().contains(id.toUpperCase())){
				i.remove();
			}
		}
	}
	public List<Contato> listarContatos(String id){
		Iterator <Contato> i = treeSetDeContatos.iterator();
		List<Contato> contatosListados = new ArrayList<Contato>();
		while(i.hasNext()){
			Contato a = i.next();
			if(a.getNome().contains(id)){
				contatosListados.add(a);
			}
		}
		return contatosListados;
	}


}
