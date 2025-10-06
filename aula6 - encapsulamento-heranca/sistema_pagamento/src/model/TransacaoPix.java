package model;

import exception.FraudeDetectadaException;

public class TransacaoPix extends Transacao {

    public TransacaoPix(Double valor) {
        super(valor);
    }

    @Override
    public boolean validarFraude() throws FraudeDetectadaException {
        if (this.valor > 10000.00){
            throw new FraudeDetectadaException("Erro sobre o valor informado! R$ " + this.valor);
        } else {
            return true;
        }
    }

    @Override
    public Double calcularTaxa() {
        return 0.5;
    }
}
