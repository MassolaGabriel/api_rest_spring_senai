package aula4;

import java.util.Scanner;

public class Metodo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("[1]Somar\n[2]Subtrair\n[3]Multiplicar\n[4]Dividir\n[0]Sair\n\tOpção: ");
			Integer opcao = sc.nextInt();
			
			if(opcao == 0) {
				System.err.println("Programa encerrado...");
				break;
			}
			
			System.out.print("Informe o numero X: ");
			Integer x = sc.nextInt();
			
			System.out.print("Informe o numero Y: ");
			Integer y = sc.nextInt();

			if (opcao == 1) {
				Integer resultado = somar(x,y);
				System.out.println("Soma: " + resultado);
			}
			
			if (opcao == 2) {
				Integer resultado = subtrair(x,y);
				System.out.println("Subtração: " + resultado);
			}
			
			if (opcao == 3) {
				Integer resultado = multiplicar(x,y);
				System.out.println("Multiplicação: " + resultado);
			}
			
			if (opcao == 4) {
				Integer resultado = dividir(x,y);
				System.out.println("Dividir: " + resultado);
			}
		}
		
	}
	
	static Integer somar(Integer x, Integer y) {
		return x + y;
	}

	static Integer subtrair(Integer x, Integer y) {
		return x - y;
	}
	
	static Integer multiplicar(Integer x, Integer y) {
		return x * y;
	}
	
	static Integer dividir(Integer x, Integer y) {
		return x / y;
	}
}
