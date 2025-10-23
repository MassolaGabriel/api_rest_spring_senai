package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "automoveis")
public class Automovel {
    private String placaAutomovel;
    private Long renavamAutomovel;
    private String chassiAutomovel;
    private String corAutomovel;
    private Integer numeroPortasAutomovel;
    private Integer tipoCombustivelAutomovel;
    private Long quilometragemAutomovel;
    private Double valorLocacaoAutomovel;
}
