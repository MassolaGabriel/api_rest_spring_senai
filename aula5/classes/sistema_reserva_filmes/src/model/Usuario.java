package model;

public class Usuario {
    private String nome;

    public Usuario() {

    }

    public Usuario(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("%s",nome);
    }
}

