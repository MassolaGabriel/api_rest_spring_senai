package dto;

public record ComponenteDTO(Integer id, String nome, Double preco) {

    @Override
    public String toString() {
        return "id: " + id +
                ", nome: " + nome + '\'' +
                ", preco: " + preco +
                '}';
    }
}
