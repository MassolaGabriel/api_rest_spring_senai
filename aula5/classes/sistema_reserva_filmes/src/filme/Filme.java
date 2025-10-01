package filme;

public class Filme {

    private String titulo;
    private String genero;
    private Integer duracao;
    private String descricao;


    public Filme(String titulo, String genero, Integer duracao, String descricao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
