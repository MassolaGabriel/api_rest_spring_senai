package Aluno;

public class Curso {
	String nomeCurso = "Java básico";
	String cargaHoraria = "120h";
	String nivel = "Médio";
	
	public Curso(String nomeCurso, String cargaHoraria, String nivel) {
		super();
		this.nomeCurso = nomeCurso;
		this.cargaHoraria = cargaHoraria;
		this.nivel = nivel;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	
}
