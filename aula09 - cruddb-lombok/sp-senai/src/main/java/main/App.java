package main;

import java.util.List;

import dao.AlunoDAO;
import model.Aluno;

public class App {

	public static void main(String[] args) {
		AlunoDAO alunoDAO =  new AlunoDAO();
		List<Aluno>alunosApp = alunoDAO.listarAlunos();
		
		for (Aluno aluno : alunosApp) {
			System.out.println(aluno);
		}
		
		
		Aluno alunoApp = alunoDAO.buscarAlunoId(2);
		System.out.println(alunoApp);
		
		
	}
		
}
