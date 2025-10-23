package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "marcas")
public class Marca {
    private String descricaoMarca;
}
