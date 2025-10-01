package abstrata;

public class CalculadoraSimples extends  Calculadora {

    @Override
    public Double multiplicar(Double num1, Double num2) {
        return num1 * num2;
    }

    @Override
    public Double dividir(Double num1, Double num2) {
        return num1 / num2;
    }
}
