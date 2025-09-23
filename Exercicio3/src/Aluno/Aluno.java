package Aluno;

public class Aluno {
	String nome;
	String sobrenome;
	Integer idade;
	
	public Aluno(String nome, String sobrenome, Integer idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", getNome()=" + getNome()
				+ ", getSobrenome()=" + getSobrenome() + ", getIdade()=" + getIdade() + "]";
	}
	
	
}
