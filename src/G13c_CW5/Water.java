package G13c_CW5;

public class Water extends Liquid{

    private boolean distilated;



    public Water( boolean distilated) {
        super("Water", 50, 1);
        this.distilated = distilated;
    }


    public boolean isDistilated() {
        return distilated;
    }

    public void setDistilated(boolean distilated) {
        this.distilated = distilated;
    }

    @Override
    int getReagent()
    {
        if (!distilated)
            return super.getReagent()/2;
        else
            return super.getReagent();
    }

    @Override
    public String toString()
    {
        return name +", reagent: " + getReagent() + ", dissolubility: "+dissolubility+", distilated: "+distilated;
    }

}
