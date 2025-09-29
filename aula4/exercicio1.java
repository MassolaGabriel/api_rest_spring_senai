package aula4;

import java.util.Scanner;

public class exercicio1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual sua idade? ");
	Integer idade = sc.nextInt();
	
	String saida = (idade < 12) ? "Criança" :
					(idade <= 17)? "Adolescente" : "Adulto";
	
	System.out.println("Classificação = " + saida);
	}
}
