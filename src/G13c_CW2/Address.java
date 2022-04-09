package G13c_CW2;

public final class Address {
    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Address(String country, String city, String street, int house, int flat) throws Exception {
        setCountry (country);
        setCity (city);
        setStreet  (street);
        setHouse (house);
        setFlat(flat);
    }

    public String toString()
    {
        return country+ ", "+city+", "+street+", "+house+"/"+flat;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) throws Exception{
        if(country==null || country.equals(""))
            throw new RuntimeException("country is empty");
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws Exception{
        if(city==null || city.equals(""))
            throw new RuntimeException("city is empty");
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) throws Exception{
        if(street==null || street.equals(""))
            throw new RuntimeException("street is empty");
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }


}

