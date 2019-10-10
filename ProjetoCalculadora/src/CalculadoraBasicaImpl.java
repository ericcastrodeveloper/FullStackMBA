public class CalculadoraBasicaImpl implements CalculadoraBasica {
    @Override
    public double soma(double x, double y) {
        return x + y;
    }

    @Override
    public double subtracao(double x, double y) {
        return x - y;
    }

    @Override
    public double divisao(double x, double y) {
        return x / y;
    }

    @Override
    public double multiplicacao(double x, double y) {
        return x * y;
    }
}
