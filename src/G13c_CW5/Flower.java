package G13c_CW5;

public class Flower extends Plant{

    public Flower(  int toxicity) {
        super( "Flower",toxicity);
    }

    @Override
    int getReagent()
    {
        return super.getReagent() / 2;

    }


    @Override
    public String toString()
    {
        return name +", reagent: " + getReagent() + ", toxicity: "+toxicity;
    }
}
