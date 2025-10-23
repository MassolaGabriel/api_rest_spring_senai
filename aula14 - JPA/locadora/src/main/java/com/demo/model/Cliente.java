package com.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cpf_cliente", length = 11, nullable = false, unique = true)
    private Long cpfCliente;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String telefone;

    @Column(name = "email_cliente", nullable = false)
    private String emailCliente;
}
