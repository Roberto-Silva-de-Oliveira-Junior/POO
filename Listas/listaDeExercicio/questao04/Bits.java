package questao04;

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
		for(int k=0;k<bits.length;k++){
			if(bits[k]==true){
				bits2+="1";
			}
			else if(bits[k]==false){
			
				bits2+="0";
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
		if(!(a.length==this.bits.length)){
			throw new TamanhosDiferentesException("Conjuntos com tamanhos diferentes, impossivel calcular");
			
		}
		else{
			boolean [] and = new boolean[a.length];
			for(int k=0;k<a.length;k++){
				if(a[k]==true && this.bits[k]==a[k]){
					and[k]=true;
				}
				else{
					and[k]= false;
				}
			}
			this.bits = and;
		}
	}
	public void or(boolean[]a)throws TamanhosDiferentesException{
		if(!(a.length==this.bits.length)){
			throw new TamanhosDiferentesException("Conjuntos com tamanhos diferentes, impossivel calcular.");
			
		}else{
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
		
		
	}
	public void not(){
		boolean [] b = new boolean[this.bits.length];
		for(int k=0;k<this.bits.length;k++){
			if(this.bits[k]==true){
				b[k]=false;
			}else if(this.bits[k]==false){
				b[k]=true;
			}
		}
		this.bits = b;
	}
}
