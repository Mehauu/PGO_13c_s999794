package G13c_CW3;

import java.util.ArrayList;
import java.util.List;


public final class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    ShoppingCart current;


    List<ShoppingCart> history = new ArrayList();

    public Person(String name, String surname, double moneyInCash,double moneyOnCard)  throws Exception  {
        setName( name);
        setSurname( surname);
        this.moneyInCash = moneyInCash;
        this.moneyOnCard = moneyOnCard;

    }

    public ShoppingCart getCurrent()  throws Exception {
        if(current==null)
            throw new RuntimeException("cart is empty");

        return current;
    }

    public List<ShoppingCart> getHistory() {
        if(history.size()==0)
            throw new RuntimeException("cart history is empty");


        return history;
    }

    public void AddProduct(Product p)  throws Exception
    {
        if(current==null)
            MakeOrder();
        current.AddProduct(p);
    }


    public void MakeOrder(){
        current = new ShoppingCart();
    }

    public void BuyByCard()  throws Exception
    {
        if(current==null || current.getTotalPrice()==0)
            throw new RuntimeException("cart is empty");


        if(current.getTotalPrice()>moneyOnCard)
            throw new RuntimeException("not enough money on card");

        current.Sell();
        history.add(current);
        MakeOrder();

    }

    public void BuyInCash()  throws Exception
    {
        if(current==null ||  current.getTotalPrice()==0)
            throw new RuntimeException("cart is empty");

        if(current.getTotalPrice()>moneyOnCard)
            throw new RuntimeException("not enough money in cash");

        current.Sell();

        history.add(current);
        MakeOrder();

    }




    public String toString()
    {
        return name+", "+surname+", cash: "+moneyInCash+", card: "+ moneyOnCard;
    }



    public void setName(String name) throws Exception{
        if(name==null || name.equals(""))
            throw new RuntimeException("name is empty");
        this.name = name;
    }



    public void setSurname(String surname)throws Exception {
        if(surname==null || surname.equals(""))
            throw new RuntimeException("surname is empty");
        this.surname = surname;
    }





}
