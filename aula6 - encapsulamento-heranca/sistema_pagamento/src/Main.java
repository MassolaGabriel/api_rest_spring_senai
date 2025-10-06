import exception.FraudeDetectadaException;
import model.Transacao;
import model.TransacaoCartao;
import model.TransacaoPix;
import model.TransacaoTed;

public class Main {
    public static void main(String[] args) {
        Transacao transacao1 = new TransacaoCartao(4500.0);
        Transacao transacao2 = new TransacaoPix(8000.0);
        Transacao transacao3 = new TransacaoTed(25000.0);

        try {
            transacao1.processar();
            transacao2.processar();
            transacao3.processar();
        }catch (FraudeDetectadaException e){
            System.out.println("Erro ao processar" + e.getMessage());
        }

        System.out.println("\n--- Teste de Transações com Fraude ---");
        Transacao transacaoInvalida1 = new TransacaoCartao(6000.0);
        Transacao transacaoInvalida2 = new TransacaoPix(12000.0);

        try {
            transacaoInvalida1.processar();
        } catch (FraudeDetectadaException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            transacaoInvalida2.processar();
        } catch (FraudeDetectadaException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}