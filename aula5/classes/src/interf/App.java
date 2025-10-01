package interf;

public class App {

    public static void main(String[] args) {
        Calculadora calc = new CalculadoraSimples();

        Double resultado = calc.multiplicar(45.0, 10.0);
        System.out.println(resultado);
    }
}
