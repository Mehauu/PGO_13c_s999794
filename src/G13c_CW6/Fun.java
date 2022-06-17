package G13c_CW6;

public interface Fun {
    double f(double x);

    static double minimum (Fun funkc, double a, double b, double alpha)
    {
        double minimum = funkc.f(a);
        for (double x = a; x <= b; x+=alpha)
        {
            if (funkc.f(x) < minimum) minimum = funkc.f(x);
        }
        return minimum;
    }
}
