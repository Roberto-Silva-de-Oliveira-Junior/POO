package questoesPraticas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaEletronica {
	private List<Contato> listaDeContatos;
	
	public List<Contato> getContatos(){
		return this.listaDeContatos;
	}
	public AgendaEletronica(){
		listaDeContatos = new ArrayList<Contato>();
	}
	public void addContato(Contato c){
		listaDeContatos.add(c);
	}
	public boolean removerContato(Contato c){
		for(Contato contatos: listaDeContatos){
			if(contatos.equals(c)){
				listaDeContatos.remove(c);
				return true;
			}
		}
		return false;
	}
	public void removerContato(String id){
		Iterator <Contato> i = listaDeContatos.iterator();
		while(i.hasNext()){
			Contato a = i.next();
			if(a.getNome().toUpperCase().contains(id.toUpperCase())){
				i.remove();
			}
		}
	}
	public List<Contato> listarContatos(String id){
		Iterator <Contato> i = listaDeContatos.iterator();
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

