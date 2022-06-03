package G13c_CW5;

public class Mineral extends Ingredient{

    protected int power;

    public Mineral(String name, int baseReagent) {
        super(name, baseReagent);
    }
    public Mineral(String name, int baseReagent,int power) {
        super(name, baseReagent);
        this.power = power;
    }


    @Override
    int getReagent()
    {
        return super.getReagent() + power;
    }

}
