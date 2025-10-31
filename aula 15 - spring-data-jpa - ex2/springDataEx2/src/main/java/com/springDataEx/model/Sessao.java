package com.springDataEx.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Criacao modelo sessao ->
@Entity
@Table(name = "sessoes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sessao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "data_sessao", nullable = false)
	private LocalDateTime dataSessao;
	
	@Column(name = "hora_sessao", nullable = false)
	private LocalTime horaSessao;
	
	@Column(name = "valor_inteira", nullable = false)
	private Double valorInteira;
	
	@Column(name = "valor_meia", nullable = false)
	private Double valorMeia;
	
	@Column(name = "sessao_encerrada", nullable = false)
	private Boolean sessaoEncerrada;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;

    @OneToMany(mappedBy = "sessao")
    private List<Ingresso> ingressos;

    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;


//	Realizar criacao lógica metodo
	public String selecionarSessao() {
        String tituloFilme = (this.filme != null) ? this.filme.getTituloFilme() : "Filme não definido";
        String numeroSala = (this.sala != null) ? this.sala.getId().toString() : "Sala não definida";

        return String.format("Sessão %d: %s [Sala: %s | Horário: %s]",
                this.id,
                tituloFilme,
                numeroSala,
                this.horaSessao.toString()
        );
	}
}
