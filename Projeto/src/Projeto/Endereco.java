package Projeto;

public class Endereco {
private int numeroDaCasa;
private String rua;
private String bairro;
private String cidade;
public Endereco(int numeroDaCasa, String rua, String bairro, String cidade) {
	super();
	this.numeroDaCasa = numeroDaCasa;
	this.rua = rua;
	this.bairro = bairro;
	this.cidade = cidade;
}
public int getNumeroDaCasa() {
	return numeroDaCasa;
}
public void setNumeroDaCasa(int numeroDaCasa) {
	this.numeroDaCasa = numeroDaCasa;
}
public String getRua() {
	return rua;
}
public void setRua(String rua) {
	this.rua = rua;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
}
