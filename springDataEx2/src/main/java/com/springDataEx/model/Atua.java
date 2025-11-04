package com.springDataEx.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "atuacoes")
@Data
public class Atua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "papel_ator", nullable = false)
    private String papelAtor;


    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "ator_id")
    private Ator ator;
}
