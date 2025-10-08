package exercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita {
	
	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("src/exercicio2/dados.csv", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//bw.newLine();
		bw.write("\nZeca,51,2300.00");
		
		bw.close();
		fw.close();
		
		}catch (IOException e) {
			System.out.println("Deu ruim: " + e.getMessage());
		}
	}
}
