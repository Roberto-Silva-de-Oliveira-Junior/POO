package questoesPraticas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class AgendaEletronicaComTreeSet{
	private TreeSet<Contato> treeListaDeContatos;
	
	public TreeSet<Contato> getContatos(){
		return this.treeListaDeContatos;
	}
	public AgendaEletronicaComTreeSet(){
		treeListaDeContatos = new TreeSet<Contato>();
	}
	public void addContato(Contato c){
		treeListaDeContatos.add(c);
	}
	public boolean removerContato(Contato c){
		for(Contato contatos: treeListaDeContatos){
			if(contatos.compareTo(c)==0){
				treeListaDeContatos.remove(c);
				return true;
			}
		}
		return false;
	}
	public void removerContato(String id){
		Iterator <Contato> i = treeListaDeContatos.iterator();
		while(i.hasNext()){
			Contato a = i.next();
			if(a.getNome().toUpperCase().contains(id.toUpperCase())){
				i.remove();
			}
		}
	}
	public List<Contato> listarContatos(String id){
		Iterator <Contato> i = treeListaDeContatos.iterator();
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
