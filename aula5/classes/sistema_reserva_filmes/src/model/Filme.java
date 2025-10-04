package model;

public class Filme {
    private String titulo;
    private String genero;
    private Integer duracao;

    public Filme(String titulo, String genero, Integer duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "filme [titulo=" + titulo + ", genero=" + genero + ", duracao=" + duracao + "]";
    }
}
