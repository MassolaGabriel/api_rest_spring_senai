package com.springDataEx.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "salas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_sala", nullable = false)
    private Integer numeroSala;

    @Column(name = "capacidade_sala", nullable = false)
    private Integer capacidadeSala;

    @OneToMany(mappedBy = "sala")
    private List<Sessao> sessoes;

    @OneToMany(mappedBy = "sala", cascade = CascadeType.ALL)
    private List<Assento> assentos;

    public Integer consultarSala(){
        return this.numeroSala;
    }


}
