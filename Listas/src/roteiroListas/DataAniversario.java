package roteiroListas;

public class DataAniversario {
	private int dia;
	private int mes;
	private int ano;
	
	public DataAniversario(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;
	}
	public boolean equals(Object obj){
		if(obj== null){
			return false;
		}
		else if(obj instanceof DataAniversario){
			DataAniversario d1 =(DataAniversario)obj;
			if(d1.getDia()==this.dia&&d1.getMes()==this.mes&&d1.getAno()==this.ano){
				return true;
			}
		}
		return false;
	}
	
}
