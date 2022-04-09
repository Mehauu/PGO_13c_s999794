package G13c_CW2;
import java.time.*;
import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Main {

    List<Book> books = new ArrayList<Book>();

    List<Person> persons = new ArrayList<Person>();

    Main() {
        try {
            Person p1 = new Person("Jan", "Kowalski", LocalDate.of(1990, Month.DECEMBER, 15), new Address("Polska", "Warszawa", "Miodowa", 1, 2));
            persons.add(p1);

            Person p2 = new Person("Anna", "Nowak", LocalDate.of(1990, Month.DECEMBER, 15), new Address("Polska", "Warszawa", "Miodowa", 1, 3));
            persons.add(p2);

            Person a1 = new Person("Henryk", "Michalik", LocalDate.of(1990, Month.DECEMBER, 15), new Address("Polska", "Warszawa", "Miodowa", 1, 4));
            persons.add(a1);

            Person a2 = new Person("Jan", "Kos", LocalDate.of(1990, Month.DECEMBER, 15), new Address("Polska", "Warszawa", "Miodowa", 1, 5));
            persons.add(a2);

            Book b1 = a1.PublishBook("ksiażka 1", Genre.Adventure, Lang.English, LocalDate.MIN);
            Book b2 = a2.PublishBook("ksiażka 2", Genre.Classic, Lang.Japanese, LocalDate.MIN);

            books.add(b1);
            books.add(b2);


            Scanner scan = new Scanner(System.in);

            int j,k;
            while (true) {


                try {
                    System.out.println("--------------------------");
                    System.out.println("Biblioteka");
                    System.out.println("--------------------------");

                    System.out.println("1 - lista osob");
                    System.out.println("2 - lista ksiazek");
                    System.out.println("3 - wypozycz");
                    System.out.println("4 - zwroc");
                    System.out.println("5 - publikuj");
                    System.out.println("0 - koniec");
                    System.out.print("> ");

                    int choice = Integer.parseInt(scan.next());
                    switch (choice) {
                        case 1:
                            for (int i = 0; i < persons.size(); i++) {
                                System.out.println(i + ": " + persons.get(i));
                            }
                            break;
                        case 2:
                            for (int i = 0; i < books.size(); i++) {
                                System.out.println(i + ": " + books.get(i));
                                if(!books.get(i).isIsAvailable())
                                    System.out.println("        Wypozyczona przez: "+ books.get(i).getPerson());
                            }
                            break;
                        case 3:
                            System.out.println("Podaj nr ksiązki");
                            j = Integer.parseInt(scan.next());
                            if(!books.get(j).isIsAvailable())
                            {
                                System.out.println("Ksiazka jest juz wypozyczona");
                                continue;
                            }
                            System.out.println("Podaj nr osoby");
                            k = Integer.parseInt(scan.next());

                            books.get(j).BorrowBook(persons.get(k));

                            break;
                        case 4:
                            System.out.println("Podaj nr ksiazki");
                            k = Integer.parseInt(scan.next());
                            if(books.get(k).isIsAvailable())
                                System.out.println("Ksiazka nie jest wypozyczona");
                            else
                                books.get(k).PlaceBack();

                            break;
                        case 5:
                            System.out.println("Podaj nr osoby");
                            j = Integer.parseInt(scan.next());
                            System.out.println("Podaj tytuł");
                            String title = scan.next();
                            System.out.println("Podaj gatunek");
                            Genre genre = Genre.valueOf(scan.next());
                            System.out.println("Podaj język");
                            Lang lang =  Lang.valueOf(scan.next());

                            Book newBook = persons.get(j).PublishBook(title, genre, lang, LocalDate.now());
                            books.add(newBook);


                            break;
                        case 0:
                            return;

                    }

                } catch (Exception ex2) {
                    System.out.println(ex2);
                }
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {

        Main library = new Main();

    }


}
