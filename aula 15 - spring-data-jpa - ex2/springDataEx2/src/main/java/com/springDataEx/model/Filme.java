package com.springDataEx.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "filmes")
@Data
public class Filme {

    @Id
    @Column(name = "id_filme")
    private Integer idFilme;

    @Column(name = "titulo_filme")
    private String tituloFilme;

    @Column(name = "duracao_filme")
    private LocalTime duracaoFilme;


    @OneToMany(mappedBy = "filme")
    private List<Sessao> sessoes;


    @OneToMany(mappedBy = "filme", cascade = CascadeType.ALL)
    private List<Genero> generos;


    @OneToMany(mappedBy = "filme", cascade = CascadeType.ALL)
    private List<Atua> atuacoes;

    public String consultarFilme(){
        return this.tituloFilme;
    }
}
