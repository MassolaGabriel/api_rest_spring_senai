package aula3;

import java.util.Scanner;

public class Laco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int multiplo = 0;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        System.out.println("Até que número multiplicaremos? ");
        multiplo =  sc.nextInt();

        for (int i = 0; i <= multiplo; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
