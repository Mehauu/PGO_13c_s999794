package G13c_CW2;
import java.time.LocalDate;
import java.time.Period;

public final class Book {
    private static Long ID=1L;
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount=0;
    private boolean isAvailable=true;
    private Person author;
    private Person person=null;

    public Person getPerson() {
        return person;
    }


    public Book(String name, Genre genre, Lang language, LocalDate publishDate) throws Exception {
        Book.ID++;
        setName (name);
        setGenre (genre);
        setLanguage (language);
        setPublishDate (publishDate);
    }

    public String toString()
    {
        return name+", "+genre+  " [author: " +author+"], available: "+isAvailable + ", borrowCount: " + borrowCount;
    }
    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) throws Exception {
        if(author==null)
            throw new RuntimeException("author is empty");
        this.author = author;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if(name==null || name.equals(""))
            throw new RuntimeException("name is empty");
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Lang getLanguage() {
        return language;
    }

    public void setLanguage(Lang language) {
        this.language = language;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) throws Exception{
        if(publishDate==null)
            throw new RuntimeException("publishDate = null");
        this.publishDate = publishDate;
    }

    public int getAge()
    {
        LocalDate today = LocalDate.now();
        Period p = Period.between(publishDate, today);
        return p.getYears();

    }
   public int getBorrowCount(Person person) {

        return borrowCount;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean BorrowBook(Person person)
    {
        if(isAvailable==false)
            return false;
        this.person = person;
        borrowCount++;
        isAvailable = false;
        return true;

    }

    public void PlaceBack()
    {
        isAvailable = true;
        person = null;
    }


}

