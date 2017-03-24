package questao02;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	public Pessoa(){
		this.nome="";
		this.idade=0;
		this.altura=0;
		this.peso=0;
		this.sexo="";
	}
	public Pessoa(String nome, int idade, double altura, 
			double peso, String sexo){
		this.nome=nome;
		this.idade=idade;
		this.altura=altura;
		this.peso=peso;
		this.sexo=sexo;	
	}
	public double calculaIMC(){
		return (this.peso/(this.altura*this.altura));
	}
	public String toString(){
		String status=null;
		if(calculaIMC()<=18.5){
			status= "Abaixo do peso normal";
		}else if(calculaIMC()>18.5&&calculaIMC()<=25){
			status = "Peso Normal";
		}else if(calculaIMC()>25&&calculaIMC()<=30){
			status = "Acima do peso normal";
		}else if(calculaIMC()>30){
			status = "Obesidade";
		}
		return "Nome :"+this.nome+"\nDescrição da categoria:"+status;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
