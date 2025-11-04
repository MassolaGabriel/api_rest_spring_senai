package com.springDataEx.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "ingressos")
@Data
public class Ingresso {
	@Id
	@Column(name = "codigo_assento_ingresso", nullable = false)
	private String codigoAssentoIngresso;
	
	@Column(name = "tipo_ingresso", nullable = false)
	private Integer tipoIngresso;

    @ManyToOne
    @JoinColumn(name = "sessao_id")
    private Sessao sessao;

    @ManyToMany(mappedBy = "ingressosComprados")
    private List<Cliente> clientes;

    public String consultarAssentoIngresso() {
        return this.codigoAssentoIngresso;
    }

    public Integer consultarTipoIngresso() {
        return this.tipoIngresso;
    }
}
