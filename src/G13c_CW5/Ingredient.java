package G13c_CW5;

public class Ingredient {
    protected String name;
    protected int baseReagent;


    Ingredient(String name,int baseReagent)
    {
        this.name = name;
        this.baseReagent = baseReagent;
    }

    int getReagent(){
        return baseReagent;
    }

    public void setReagent(int baseReagent) {
        this.baseReagent = baseReagent;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name +", reagent: " + getReagent();
    }



}
