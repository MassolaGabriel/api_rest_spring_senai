package demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20, nullable = false)
    private String nome;

    @Column(name = "data_nascimento", unique = true, nullable = false)
    private LocalDate dataNascimento;

//    @OneToMany(mappedBy = "aluno")
//    private List<Matricula> matriculas;

    @OneToOne
    @JoinColumn(name = "fk_id_endereco", nullable = false)
    private Endereco endereco;

}
