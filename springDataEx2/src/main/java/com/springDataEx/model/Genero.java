package com.springDataEx.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "generos")
@Data
public class Genero {

    @Id
    @Column(name = "id_genero")
    private Integer idGenero;

    @Column(name = "descricao_genero")
    private String descricaoGenero;


    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;
}
