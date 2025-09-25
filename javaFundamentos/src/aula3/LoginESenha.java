package aula3;

import java.util.Scanner;

public class LoginESenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioAcesso = "admin";
        String senhaAcesso = "senha123";

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite seu usuario: ");
            String usuario = sc.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = sc.nextLine();

            if (usuarioAcesso.equalsIgnoreCase(usuario) && senhaAcesso.equals(senha)) {
                System.out.println("Autenticação bem-sucedida");
                break;
            } else {
                if (i == 2) {
                    System.out.println("\nAcesso bloqueado - o número máximo de tentativas foi atingido!");
                } else {
                    System.out.println("Login ou senha incorretos. Tente novamente.\n");
                }
            }
        }
    }
}