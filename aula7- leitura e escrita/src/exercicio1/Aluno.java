package exercicio1;

public class Aluno {
	private String nome;
	private Integer nota;
	
	public Aluno(String nome, Integer nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", nota: " + nota;
	}
	
	
}
