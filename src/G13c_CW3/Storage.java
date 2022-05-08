package G13c_CW3;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private int deliveryTime;

    List<Product> products = new ArrayList();

    public Storage(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public void AddProduct(Product p)
    {
        products.add(p);
    }

}
