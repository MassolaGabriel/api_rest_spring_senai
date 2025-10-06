package model;

import exception.FraudeDetectadaException;

public class TransacaoTed extends Transacao {
    public TransacaoTed(Double valor) {
        super(valor);
    }

    @Override
    public boolean validarFraude() throws FraudeDetectadaException {
        if (this.valor > 50000.00){
            throw new FraudeDetectadaException("Erro sobre o valor informado! R$ " + this.valor);
        } else {
            return true;
        }
    }

    @Override
    public Double calcularTaxa() {
        return 15.0;
    }
}
