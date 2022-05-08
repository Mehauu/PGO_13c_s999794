package G13c_CW3;


public class Product {
    private String name;
    private ProductType productType;
    private double price;
    private int quantity;

    private Storage storage=null;



    public Product(String name, ProductType productType, double price, int quantity) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString(boolean showQuantity)
    {
        if(showQuantity)
            return name+", "+ productType +", "+price + " zł, quantity: "+ quantity;
        else
            return name+", "+ productType +", "+price + " zł";

    }


    public boolean IsAvailable()
    {
        if(quantity>0)
            return true;
        else
            return false;
    }

    public void Sell() throws Exception
    {
        if(quantity==0)
            throw new RuntimeException("Product " + name +" quantity = 0");
        quantity--;
    }

    public void IncreaseQuantity(int i)
    {
        quantity+=i;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
        storage.AddProduct(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}
