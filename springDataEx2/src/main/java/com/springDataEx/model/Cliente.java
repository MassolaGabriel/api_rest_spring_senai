package com.springDataEx.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Chave primária padrão para o cliente

    @Column(name = "nome_cliente", nullable = false)
    private String nome;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cliente_ingressos",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "ingresso_id", referencedColumnName = "codigo_assento_ingresso")
    )

    private List<Ingresso> ingressosComprados;
}