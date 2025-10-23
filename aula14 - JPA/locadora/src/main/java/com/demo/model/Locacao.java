package com.demo.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.text.DateFormat;

@Entity
@Table(name = "locacoes")
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_locacao", nullable = false)
    private DateFormat dataLocacao;

    
    private Time horaLocacao;
    private DateFormat dataDevolucao;
    private Time horaDevolucao;
    private Long quilometragemLocacao;
    private Long quilometragemDevolucao;
    private Double valorCaucao;
    private Double valorLocacao;
    private Boolean locacaoDevolvida;
}
