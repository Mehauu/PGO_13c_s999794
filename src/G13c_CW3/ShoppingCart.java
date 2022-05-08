package G13c_CW3;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    private static int ID = 1;
    private int id;
    private int totalPrice;
    private int totalDeliveryTime;

    List<Product> products = new ArrayList();

    ShoppingCart()
    {
        this.id = ShoppingCart.ID;
        ShoppingCart.ID++;

    }

    public String toString()
    {
        String str = "Cart "+id+"\n";
        str+="total price: "+getTotalPrice()+", delivery time: "+getTotalDeliveryTime()+"\n";
        for(Product p: products)
        {
            str += p.toString(false)+"\n";
        }
        return str;
    }


    public void Sell() throws Exception
    {

        int i=0;
        try{
            for(;i<products.size();i++)
            {
                products.get(i).Sell();
            }
        }
        catch(Exception ex)
        {

            for(int j=0;j<i;j++)
            {
                products.get(j).IncreaseQuantity(1);

            }

            throw ex;
        }

    }


    public void AddProduct(Product p)  throws Exception
    {
        if(!p.IsAvailable())
            throw new RuntimeException("product is not available");

        products.add(p);

    }

    public int getTotalPrice() {
        totalPrice = 0;
        for(Product p: products)
        {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }


    public int getTotalDeliveryTime() {
        totalDeliveryTime = 0;
        for(Product p: products)
        {
            if(p.getStorage()!=null)
            {
                if(p.getStorage().getDeliveryTime() > totalDeliveryTime)
                    totalDeliveryTime = p.getStorage().getDeliveryTime();
            }
        }

        return totalDeliveryTime;
    }

    public void setTotalDeliveryTime(int totalDeliveryTime) {
        this.totalDeliveryTime = totalDeliveryTime;
    }


}
