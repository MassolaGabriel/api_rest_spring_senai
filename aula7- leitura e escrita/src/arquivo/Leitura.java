package arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitura {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("src/arquivo/dados.csv");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = br.readLine();
			String[] linhas;
			Double folhaPagamento = 0.0;

			while((linha = br.readLine()) != null) {
				linhas = linha.split(";");
				folhaPagamento += Double.parseDouble(linhas[2]);
				System.out.println(linhas[2]);
			}
			
			System.out.println("Total Folha: " + folhaPagamento);
			
		} catch (IOException e) {
			System.out.println("Deu ruim: " + e.getMessage());
		}
	}
}
