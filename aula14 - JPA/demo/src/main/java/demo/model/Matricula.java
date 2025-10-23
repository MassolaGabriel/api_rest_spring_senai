package demo.model;

import jakarta.persistence.*;
import jdk.jfr.Name;

@Entity
@Table(name = "matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero_matricula", nullable = false, length = 8)
    private Integer numeroMatricula;

    @ManyToOne
    @JoinColumn(name = "fk_id_aluno")
    private Aluno aluno;
}
