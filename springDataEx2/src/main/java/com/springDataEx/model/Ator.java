package com.springDataEx.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;
import java.util.stream.Stream;

@Entity
@Table(name = "atores")
@Data
public class Ator {
    @Column(name = "nome_ator")
    public String nomeAtor;

    @Column
    @Id
    private String idAtor;


    @OneToMany(mappedBy = "ator", cascade = CascadeType.ALL)
    private List<Atua> atuacoes;
}
