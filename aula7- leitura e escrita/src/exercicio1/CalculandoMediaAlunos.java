package exercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalculandoMediaAlunos {
	
	// Constante para a média de aprovação
	private static final int MEDIA_APROVACAO = 80;

	public static void main(String[] args) {
		
		try {
			List<Aluno> alunos = carregarAlunosDoArquivo("src/exercicio1/notas.csv");
			
			double mediaGeral = calcularMediaGeral(alunos);
			
			exibirResultados(alunos, mediaGeral);
			
			encontrarAlunoComMaiorNota(alunos);
			
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
	}
	
	public static List<Aluno> carregarAlunosDoArquivo(String caminhoArquivo) throws IOException {
		List<Aluno> alunos = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			br.readLine();
			
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] dados = linha.split(";");
				String nome = dados[0];
				Integer nota = Integer.parseInt(dados[1]);
				alunos.add(new Aluno(nome, nota));
			}
		}
		return alunos;
	}
	
	public static double calcularMediaGeral(List<Aluno> alunos) {
		if (alunos.isEmpty()) {
			return 0.0;
		}
		
		int somaNotas = 0;
		for (Aluno aluno : alunos) {
			somaNotas += aluno.getNota();
		}
		return (double) somaNotas / alunos.size();
	}

	public static void encontrarAlunoComMaiorNota(List<Aluno> alunos) {
		if (alunos.isEmpty()) {
			System.out.println("Não há alunos na lista.");
			return;
		}
		
		Aluno alunoComMaiorNota = alunos.get(0);
		for (int i = 1; i < alunos.size(); i++) {
			if (alunos.get(i).getNota() > alunoComMaiorNota.getNota()) {
				alunoComMaiorNota = alunos.get(i);
			}
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("Aluno com a maior nota: " + alunoComMaiorNota);
	}

	public static void exibirResultados(List<Aluno> alunos, double mediaGeral) {
		System.out.println("------------------- Relatório de Notas dos Alunos -------------------");
		System.out.printf("%-10s | %-5s | %-10s | %-18s\n", "Nome", "Nota", "Situação", "Acima da Média Geral");
		System.out.println("----------------------------------------------------------------");
		
		for (Aluno aluno : alunos) {
			String situacao = (aluno.getNota() >= MEDIA_APROVACAO) ? "Aprovado" : "Reprovado";
			String acimaDaMedia = (aluno.getNota() > mediaGeral) ? "Sim" : "Não";
			
			System.out.printf("%-10s | %-5d | %-10s | %-18s\n", 
				aluno.getNome(), aluno.getNota(), situacao, acimaDaMedia);
		}
		
		System.out.println("----------------------------------------------------------------");
		System.out.printf("Média Geral das Notas: %.2f\n", mediaGeral);
	}
}