package model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BibliotecaFilmes {
    static Scanner scanner = new Scanner(System.in);

    public void listarFilmes(Filme[] filmes) {
        System.out.println("Lista de Filmes:");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }

    public void adicionarFilme(Filme[] filmes ){
        try {
            System.out.println("====== CADASTRO DE FILME ======");
            System.out.print("Titulo: ");
            String titulo = scanner.next();
            System.out.print("Genero: ");
            String genero = scanner.next();
            System.out.print("Duração: ");
            Integer duracao = scanner.nextInt();

            Filme filme = new Filme(titulo, genero, duracao);
        }catch (InputMismatchException e){
            System.out.println("Erro ao adicionar um novo filme");
        } finally {
            scanner.nextLine();
        }
    }

    public ArrayList<Filme> buscarPorGenero(Filme[] filmes){
        System.out.print("Informe o Gênero de filme desejado: ");
        String obterGenero = scanner.next();

        ArrayList<Filme> filmePorGenero = new ArrayList<>();

        for (Filme filme: filmes){
            if (filme.getGenero().equalsIgnoreCase(obterGenero)){
                filmePorGenero.add(filme);
            }
        }

        return filmePorGenero;
    }
}
