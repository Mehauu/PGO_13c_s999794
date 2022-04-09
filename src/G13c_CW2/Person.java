package G13c_CW2;

import java.time.LocalDate;
import java.time.Period;


public final class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Address address;


    public Person(String name, String surname, LocalDate dateOfBirth,Address address) throws Exception {
        setName(name);
        setSurname( surname);
        setDateOfBirth( dateOfBirth);
        setAddress(address);
    }

    public String toString()
    {
        return name+", "+surname+", "+dateOfBirth+", "+address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) throws Exception {
        if(address==null )
            throw new RuntimeException("address = null");
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if(name==null || name.equals(""))
            throw new RuntimeException("name is empty");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname)throws Exception {
        if(surname==null || surname.equals(""))
            throw new RuntimeException("surname is empty");
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) throws Exception{
        if(dateOfBirth==null )
            throw new RuntimeException("country = null");
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge()
    {
        LocalDate today = LocalDate.now();
        Period p = Period.between(dateOfBirth, today);
        return p.getYears();

    }


    Book PublishBook(String name, Genre genre, Lang language, LocalDate publishDate) throws Exception
    {
        Book book = new Book( name,  genre,  language,  publishDate);
        book.setAuthor(this);
        return book;
    }
}
