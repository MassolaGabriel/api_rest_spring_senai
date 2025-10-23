package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "modelos")
public class Modelo {
    private String descricaModelo;
    public String consultarModelo() {
        return descricaModelo;
    }
}
