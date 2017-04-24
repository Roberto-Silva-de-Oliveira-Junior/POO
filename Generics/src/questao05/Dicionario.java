package questao05;

import java.util.ArrayList;
import java.util.List;

public class Dicionario <K,V>{
	private List<K> l1;
	private List<V> l2;
	protected int qtdeDeElementos;

	
	public Dicionario(){
		l1 = new ArrayList<K>();
		l2 = new ArrayList<V>();
	}
	public void add(K key, V value){
		l1.add(key);
		l2.add(value);
	}
	public V getValue(K key){
		for(int k=0;k<l1.size();k++){
			if(key==l1.get(k)){
				return l2.get(k);
			}
		}
		return null;
	}
	public int getQtdeDeElementos(){
		return l2.size();
	}


}
