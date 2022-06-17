package G13c_CW6;

public class SquareFunction extends Function implements Fun{

    private double a, b, c;

    SquareFunction(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double f(double x) {
        return a*x*x + b * x + c;
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        a += delta;
        b += delta;
        c += delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a -= delta;
        b -= delta;
        c -= delta;
    }
}
