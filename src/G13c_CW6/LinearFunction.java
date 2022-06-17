package G13c_CW6;

public class LinearFunction extends Function implements Fun{

    private double a;
    private double b;

    LinearFunction(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double f(double x) {
        return a * x + b;
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        a += delta;
        b += delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a -= delta;
        b -= delta;
    }
}
