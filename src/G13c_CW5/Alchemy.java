package G13c_CW5;

public class Alchemy {


    public static void main(String[] args) {

        Water wodaDestlylowana = new Water(true);
        Elixir elixir = new Elixir("eliksir",wodaDestlylowana);

        Ore zloto = new Ore(true);

        Flower kwiat = new Flower(30);

        elixir.addIngredient(kwiat);
        elixir.addIngredient(zloto);

        elixir.Create();

        System.out.println(elixir);

    }


}
