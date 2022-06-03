package G13c_CW5;

import java.util.ArrayList;
import java.util.List;


public class Elixir {
    String name;
    boolean isCreated=false;
    int power=0;
    List<Ingredient> ingredients = new ArrayList();
    Liquid catalyst;

    public Elixir(String name) {
        this.name = name;
    }

    public Elixir(String name, Liquid catalyst) {
        this.name = name;
        this.catalyst = catalyst;
    }

    @Override
    public String toString()
    {
        String txt = "Elixir: " + name+", power: " + getPower()+ "\n Catalyst: " + catalyst+"\n Ingredients: \n";
        for(Ingredient i:ingredients)
        {
            txt+= "  "+i+"\n";
        }

        return txt;
    }

    void Create()
    {
        for(Ingredient i:ingredients)
        {
            power+=i.getReagent() ;
        }
        power /= catalyst.getReagent();
        isCreated = true;
    }

    void addIngredient(Ingredient i)
    {
        ingredients.add(i);
    }

    void removeIngredient(Ingredient i)
    {
        ingredients.remove(i);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void setCatalyst(Liquid catalyst) {
        if(!isCreated)
            this.catalyst = catalyst;
    }


}

