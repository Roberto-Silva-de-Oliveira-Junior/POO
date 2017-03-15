package roteiroListas;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;
	
	public Aniversariante(String nome, int dia,int mes, int ano){
		this.nome = nome;
		dataAniversario = new DataAniversario(dia, mes, ano);
	}
	public DataAniversario getDataAniversario(){
		return dataAniversario;
	}
	public void setDataAniversario(DataAniversario dataAniversario){
		this.dataAniversario = dataAniversario;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public boolean ehAniversarianteDoMes(int mes){
		if(dataAniversario.getMes()==mes){
			return true;
		}
		return false;
	}
	

}
