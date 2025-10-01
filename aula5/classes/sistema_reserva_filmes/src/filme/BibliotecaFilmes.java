package filme;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaFilmes {

    private static ArrayList<Filme> filmes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);



        Filme f1 = new Filme("Avatar", "Aventura", 132, "Homens viajam em uma maquina virando humanóides azuis") ;
        Filme f2 = new Filme("Interstellar", "Ficção", 182, "Tentando salvar a terra");
        Filme f3 = new Filme("Clube da luta", "Ação", 91, "Um homem deprimido cria um clube de luta com outros homens deprimidos");

        filmes.add(f1);
        filmes.add(f2);
        filmes.add(f3);

        Integer opcao;

        do {
            System.out.println("------ SELECIONE UMA OPÇÃO -------\n[1]Adicionar novo filme: \n[2]Exibir detalhes do filme\n[3]Remover filme: \n[0]Sair \n\tOpção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarFilmes();
                    break;
            }

        }while (opcao != 0);


    }

    public static void listarFilmes(){
        System.out.println("----- FILMES CADASTRADOS ------");

        for (Filme f : filmes){
            System.out.println(f.toString());
        }
    }
}
