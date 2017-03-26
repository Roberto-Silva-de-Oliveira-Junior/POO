package questoesPraticas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AgendaEletronicaComHashMap {
	Map<Integer,Contato>hashMapDeContatos;

	public Collection<Contato> getContatos(){
		return this.hashMapDeContatos.values();
	}
	public AgendaEletronicaComHashMap(){
		hashMapDeContatos = new HashMap<Integer, Contato>();
	}
	public void addContato(Contato c){
		hashMapDeContatos.put(c.getNumero(),c);
	}
	public boolean removerContato(Contato c){
		for(Contato value: hashMapDeContatos.values()){
			if(value.equals(c)){
				hashMapDeContatos.remove(c);
				return true;
			}
		}
		return false;
	}
	public void removerContato(String id){
		Iterator <Contato> i = hashMapDeContatos.values().iterator();
		while(i.hasNext()){
			Contato a = i.next();
			if(a.getNome().toUpperCase().contains(id.toUpperCase())){
				i.remove();
			}
		}
	}
	public List<Contato> listarContatos(String id){
		Iterator <Contato> i = hashMapDeContatos.values().iterator();
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
