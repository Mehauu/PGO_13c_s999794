package G13c_CW5;

public class Liquid extends Ingredient{

    protected int dissolubility;

    public Liquid(String name, int baseReagent) {
        super(name, baseReagent);
        this.dissolubility = 1;
    }

    public Liquid(String name, int baseReagent,int dissolubility) {
        super(name, baseReagent);
        this.dissolubility = dissolubility;
    }

    public int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        this.dissolubility = dissolubility;
    }

    @Override
    int getReagent()
    {
        return baseReagent * dissolubility;
    }

}
