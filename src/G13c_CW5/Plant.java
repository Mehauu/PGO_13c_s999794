package G13c_CW5;

public class Plant extends Ingredient {
    protected int toxicity;

    public Plant(String name,int toxicity) {
        super(name, 20);
        this.toxicity = toxicity;
    }

    public int getToxicity() {
        return toxicity;
    }

    public void setToxicity(int toxicity) {
        this.toxicity = toxicity;
    }

    @Override
    int getReagent()
    {
        return super.getReagent()*toxicity;
    }

}
