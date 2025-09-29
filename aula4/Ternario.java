package aula4;

import java.util.Scanner;

public class Ternario {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual o numero Um?");
	int numeroUm = sc.nextInt();
	
	System.out.println("Qual o numero dois?");
	int numeroDois = sc.nextInt();

	Integer maior = (numeroUm > numeroDois) ? numeroUm : numeroDois;
	
	System.out.println("Maior: " + maior);
	
 }
}
