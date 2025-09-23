package primeiro_projeto;

import java.util.Scanner;



public class HelloJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		System.out.println("Escolha sua operação: [1]SOMA [2]subtraçao [3] multiplicaçao [4]Divisão [0]Encerrar programa.");
		opcao = scanner.nextInt();
		
		switch (opcao) {
        case 1:
            soma(scanner);
            break;
        case 2:
            subtracao(scanner);
            break;
        case 3:
            multiplicacao(scanner);
            break;
        case 4:
            divisao(scanner);
            break;
        case 0:
            System.out.println("Encerrando o programa");
            break;
		}
	}

	private static void soma(Scanner scanner) {
		int x = 0;
		int y = 0;
		
		System.out.println("Insira o primeiro numero 1");
		x = scanner.nextInt();
		
		System.out.println("Insira o primeiro numero 2");
		y = scanner.nextInt();

		System.out.println("soma de " + x + " + " + y + " = " + (x + y));
	}
	
	private static void subtracao(Scanner scanner) {
		int x = 0;
		int y = 0;
		
		System.out.println("Insira o primeiro numero 1");
		x = scanner.nextInt();
		
		System.out.println("Insira o primeiro numero 2");
		y = scanner.nextInt();

		System.out.println("subtração de " + x + " - " + y + " = " + (x - y));
	}
	
	private static void multiplicacao(Scanner scanner) {
		int x = 0;
		int y = 0;
		
		System.out.println("Insira o primeiro numero 1");
		x = scanner.nextInt();
		
		System.out.println("Insira o primeiro numero 2");
		y = scanner.nextInt();

		System.out.println("multiplicacao de " + x + " * " + y + " = " + (x * y));
	}
	
	private static void divisao(Scanner scanner) {
		int x = 0;
		int y = 0;
		
		System.out.println("Insira o primeiro numero 1");
		x = scanner.nextInt();
		
		System.out.println("Insira o primeiro numero 2");
		y = scanner.nextInt();

		System.out.println("Divisão de " + x + " / " + y + " = " + (x / y));
	}
}
