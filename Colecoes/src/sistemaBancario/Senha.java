package sistemaBancario;

public class Senha implements Comparable <Senha>{
	private String nome;
	private int idade;
	private int cpf;
	public Senha(String nome, int idade, int cpf){
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}else if(obj instanceof Senha){
			Senha s = (Senha) obj;
			if(this.cpf==s.cpf){
				return true;
			}
		}
		return false;
	}
	public int compareTo(Senha s){
			if(this.idade==s.getIdade()){
				return 0;
			}else if(this.idade<s.getIdade()){
				return 1;
			}else{
				return -1;
			}
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
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String toString(){
		return "Nome :"+this.getNome()+"\nIdade :"+this.idade+"\nCPF :"+this.cpf;
	}
}
