package main;

import java.util.List;

import dao.AlunoDAO;
import model.Aluno;

public class App {

	public static void main(String[] args) {
		AlunoDAO alunoDAO =  new AlunoDAO();
		List<Aluno>alunosApp = alunoDAO.listar();
		
		for (Aluno aluno : alunosApp) {
			System.out.println(aluno);
		}
		
		
		Aluno alunoApp = alunoDAO.buscarPorId(2);
		System.out.println(alunoApp);
		
//		Aluno alunoA = new Aluno();
//		alunoA.setId(4);
//		alunoA.setNome("Janaina");
		
//		alunoDAO.salvar(alunoA);
		
//		alunoDAO.atualizar(alunoA);
		
//		alunoDAO.remover(alunoA);
	}
		
}
