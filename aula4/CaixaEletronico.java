package aula4;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual nosso saldo atual? ");
		Double saldo = sc.nextDouble();

		int opcao = 0;

		do {

			System.out.println(
					"------ MENU CAIXA ELETRONICO ------\n[1]Saque\n[2]Depósito\n[3]Consultar Saldo\n[4]Sair\n\tOpção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Qual valor iremos sacar? ");
				Double valorSaque = sc.nextDouble();

				if (saldo > valorSaque) {
					saldo = sacar(saldo, valorSaque);
					System.out.println("Valor sacado com sucesso!\nSaldo atual: " + saldo);
				} else {
					System.err.println("Saldo insuficiente!");
				}
				break;

			case 2:
				System.out.println("Qual valor iremos depositar? ");
				Double valorDeposito = sc.nextDouble();

				if (valorDeposito > 0) {
					saldo = depositar(saldo, valorDeposito);
					System.out.println("Valor depositado com sucesso!\nSaldo atual: " + saldo);
				} else {
					System.out.println("Valor do depósito deve ser positivo");
				}
				break;

			case 3:
				System.out.println("Saldo atual: " + saldo);
				break;
				
			case 4:
				System.err.println("Saindo do menu...");
				break;
			}
		} while (opcao != 4);
	}

	static Double sacar(Double saldo, Double valorSaque) {
		return saldo - valorSaque;
	};

	static Double depositar(Double saldo, Double valorDeposito) {
		return saldo + valorDeposito;
	};

}
