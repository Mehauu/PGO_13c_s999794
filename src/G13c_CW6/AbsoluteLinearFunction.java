package G13c_CW6;

public class AbsoluteLinearFunction extends LinearFunction implements  Fun{

    AbsoluteLinearFunction(double a, double b) {
        super(a, b);
    }

    @Override
    public double f(double x) {
        double y = super.f(x);
        if ( y < 0) y *= -1;
        return y;
    }
}
