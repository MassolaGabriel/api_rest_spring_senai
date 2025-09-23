package Aluno;

public class Main {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Gabriel", "Massola", 19);
		Curso curso1 = new Curso("Java Avançado", "120h", "Médio");

		Matricula matricula1 = new Matricula(aluno1, curso1);
		
		String nomeAluno = matricula1.getAluno().getNome();
		String sobrenomeAluno = matricula1.getAluno().getSobrenome();
		String nomeCurso = matricula1.getCurso().getNomeCurso();
		
		System.out.println("----- DADOS DA MATRICULA -----");
		System.out.println("Aluno: " + nomeAluno + " " + sobrenomeAluno);
		System.out.println("Curso: " + nomeCurso);
		System.out.println("Data da matrícula " + matricula1.getDataMatricula());
		System.out.println("----- FIM DO PROGRAMA -----");
	}
}
