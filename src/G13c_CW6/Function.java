package G13c_CW6;

public abstract class Function implements Fun{
    //@Override
    abstract public double f(double x) ;

    abstract void increaseCoefficientsBy(double delta);

    abstract void decreaseCoefficientsBy(double delta);
}
