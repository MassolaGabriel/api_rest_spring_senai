package interf;

public class CalculadoraSimples implements Calculadora {

    @Override
    public Double somar(Double num1, Double num2) {
        return num1 + num2;
    }

    @Override
    public Double subtrair(Double num1, Double num2) {
        return num1 - num2;
    }

    @Override
    public Double multiplicar(Double num1, Double num2) {
        return num1 * num2;
    }

    @Override
    public Double dividir(Double num1, Double num2) {
        return num1 / num2;
    }
}
