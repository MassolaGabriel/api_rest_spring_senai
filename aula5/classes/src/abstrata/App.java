package abstrata;

public class App {
    public static void main(String[] args) {
        Calculadora calc = new CalculadoraSimples();

        Double retorno = calc.somar(10.5, 11.75);

        System.out.println(retorno);

        retorno = calc.multiplicar(5.0, 50.0);

        System.out.println(retorno);
    }
}
