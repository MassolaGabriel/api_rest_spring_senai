package com.springDataEx.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "salas")
@Data
public class Sala {
    @Id
    @Column(name = "numero_sala", nullable = false)
    private Integer numeroSala;

    @Column(name = "capacidade_sala")
    private Integer capacidadeSala;

    @OneToMany(mappedBy = "sala")
    private List<Sessao> sessoes;

    @OneToMany(mappedBy = "sala", cascade = CascadeType.ALL)
    private List<Assento> assentos;

    public Integer consultarSala(){
        return this.numeroSala;
    }


}
