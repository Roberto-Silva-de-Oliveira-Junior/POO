package Questao04;

import java.util.Arrays;

public class Bits {
	private boolean[] bits;
	
	public Bits(int tamanho){
		bits = new boolean [tamanho];
	}
	
	public boolean getUmBit(int posicao) throws PosicaoNaoExisteException{
		if(posicao<=bits.length){
			return bits[posicao-1];
		}else{
			throw new PosicaoNaoExisteException("A posição desejada não existe.\n"
					+ "Tente um número menor ou igual a "+bits.length);
		}
	}
	public void setUmBit(int posicao, boolean afirmacao )throws PosicaoNaoExisteException{
		if(posicao<=bits.length){
			this.bits[posicao-1]=afirmacao;
		}else{
			throw new PosicaoNaoExisteException("A posição desejada não existe.\n"
					+ "Tente um número menor ou igual a "+bits.length);
		}
	}
	
	public boolean[] getBits(){
		return this.bits;
	}
	public void setBits(boolean[] bits){
			this.bits=bits;
	}
	public String toString(){
		String bits2 = "";
		for(int k=0;k<bits.length-1;k++){
			if(bits[k]==true){
				bits2+="1,";
			}
			else{
			
				bits2+="0,";
			}
			
		}
		return "("+bits2+")";
	}
	public  boolean equals(Object obj){
		if(obj==null){
			return false;
		}else if(obj instanceof Bits){
			Bits b = (Bits)obj;
			if(Arrays.equals(bits, b.bits)){
				return true;
			}
		}
		return false;
	}
	public void and(boolean[]a)throws TamanhosDiferentesException{
		if(a.length==this.bits.length){
			boolean [] and = new boolean[a.length];
			for(int k=0;k<a.length;k++){
				if(a[k]==true && this.bits[k]==true){
					and[k]=true;
				}
				else{
					and[k]= false;
				}
			}
			this.bits = and;
		}
		throw new TamanhosDiferentesException("Conjuntos com tamanhos diferentes, impossivel calcular");
		
	}
	public void or(boolean[]a)throws TamanhosDiferentesException{
		if(a.length==this.bits.length){
			boolean [] or = new boolean[a.length];
			for(int k=0;k<a.length;k++){
				if(a[k]==true||this.bits[k]==true){
					or[k]=true;
				}
				else{
					or[k]=false;
				}
			}
			this.bits = or;
			}
		throw new TamanhosDiferentesException("Conjuntos com tamanhos diferentes, impossivel calcular.");
	}
	public void not(boolean[] a){
		boolean [] b = new boolean[a.length];
		for(int k=0;k<a.length;k++){
			if(a[k]==true){
				b[k]=false;
			}else if(a[k]==false){
				b[k]=true;
			}
		}
		this.bits = b;
	}
}
