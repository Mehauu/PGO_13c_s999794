package G13c_CW5;

public class Ore extends Mineral {

    private boolean metallic;

    public Ore(boolean metallic) {
        super("Ore",30);
        this.metallic= metallic;
    }


    @Override
    int getReagent()
    {
        if(!metallic)
            return super.getReagent() / power;
        else
            return super.getReagent();
    }

    @Override
    public String toString()
    {
        return name +", reagent: " + getReagent() + ", metallic: "+metallic;
    }
}
