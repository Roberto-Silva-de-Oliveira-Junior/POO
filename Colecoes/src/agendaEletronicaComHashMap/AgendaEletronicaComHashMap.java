package agendaEletronicaComHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AgendaEletronicaComHashMap {
	private Map<String, Contato> hashMapDeContatos;

	public AgendaEletronicaComHashMap() {
		hashMapDeContatos = new HashMap<String, Contato>();
	}

	public Collection<Contato> getContatos() {
		return this.hashMapDeContatos.values();
	}

	public void addContato(String nome, Contato c) {
		hashMapDeContatos.put(nome, c);
	}

	public boolean removerContato(Contato c) {
		for (Contato value : hashMapDeContatos.values()) {
			if (value.equals(c)) {
				hashMapDeContatos.remove(c);
				return true;
			}
		}
		return false;
	}

	public void removerContato(String id) {
		Iterator<String> i = hashMapDeContatos.keySet().iterator();
		while (i.hasNext()) {
			String a = i.next();
			if (a.toUpperCase().contains(id.toUpperCase())) {
				i.remove();
			}
		}
	}

	public HashMap<String, Contato> listarContatos(String id) {
		HashMap<String, Contato> contatosListados = new HashMap<String, Contato>();
		for (String key : hashMapDeContatos.keySet()) {
			if (key.contains(id)) {
				contatosListados.put(key, hashMapDeContatos.get(key));
			}
		}
		return contatosListados;
	}

}
