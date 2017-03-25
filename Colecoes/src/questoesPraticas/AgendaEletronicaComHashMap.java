package questoesPraticas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AgendaEletronicaComHashMap {
	Map<Integer,Contato>example;

	public Collection<Contato> getContatos(){
		return this.example.values();
	}
	public AgendaEletronicaComHashMap(){
		example = new HashMap<Integer, Contato>();
	}
	public void addContato(Contato c){
		example.put(c.getNumero(),c);
	}
	public boolean removerContato(Contato c){
		for(Contato value: example.values()){
			if(value.equals(c)){
				example.remove(c);
				return true;
			}
		}
		return false;
	}
	public void removerContato(String id){
		Iterator <Contato> i = example.values().iterator();
		while(i.hasNext()){
			Contato a = i.next();
			if(a.getNome().toUpperCase().contains(id.toUpperCase())){
				i.remove();
			}
		}
	}
	public List<Contato> listarContatos(String id){
		Iterator <Contato> i = example.values().iterator();
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
