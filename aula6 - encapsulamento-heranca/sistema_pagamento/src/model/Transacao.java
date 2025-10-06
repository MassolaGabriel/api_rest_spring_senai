package model;

import exception.FraudeDetectadaException;

import java.time.LocalDateTime;

public abstract class Transacao {
    public Double valor;
    public LocalDateTime dataHora;
    public String status;

    public Transacao(double valor) {
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
        this.status = "Iniciada";
    }

    public abstract boolean validarFraude() throws FraudeDetectadaException;
    public abstract Double calcularTaxa();

    public void processar() {
        System.out.println("Processando Transacao...");

        if (validarFraude()) {
            System.out.println("Transação processada! Taxa calculada: " + calcularTaxa());
            this.status = "APROVADA";
        } else {
            System.out.println("Transação suspeita de fraude!");
            this.status = "REJEITADA";
        }

        System.out.println("Status da transação: " + this.status);
    }
}

