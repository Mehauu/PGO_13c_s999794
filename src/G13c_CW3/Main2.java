package G13c_CW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    List<Product> products = new ArrayList<Product>();

    List<Person> persons = new ArrayList<Person>();

    Main2() {
        try {
            Person p1 = new Person("Jan", "Kowalski", 100,100);
            persons.add(p1);

            Person p2 = new Person("Anna", "Nowak", 200,300);
            persons.add(p2);


            Storage storage1 = new Storage(10);
            Storage storage2 = new Storage(3);

            Product pr1 = new Product("komputer",ProductType.Electronic,100,1);
            pr1.setStorage(storage1);
            products.add(pr1);

            Product pr2 = new Product("pietruszka",ProductType.Consumable,3,10);
            pr2.setStorage(storage2);
            products.add(pr2);

            Product pr3 = new Product("film Batman",ProductType.Entertainment,3,10);
            products.add(pr3);



            // rozpoczynamy pętle, w której będziemy wyświetlać menu i pobierać dane od
            //usera

            Scanner scan = new Scanner(System.in);

            int j, k;
            while (true) {

                try {
                    System.out.println("--------------------------");
                    System.out.println("Sklep");
                    System.out.println("--------------------------");

                    System.out.println("1 - lista osob");
                    System.out.println("2 - lista produktów");
                    System.out.println("3 - pokaż koszyk");
                    System.out.println("4 - nowy koszyk");
                    System.out.println("5 - historia koszyków");
                    System.out.println("6 - dodaj do koszyka");
                    System.out.println("7 - zapłać gotówką");
                    System.out.println("8 - zapłać kartą");
                    System.out.println("0 - koniec");
                    System.out.print("> ");

                    int choice = Integer.parseInt(scan.next());
                    switch (choice) {
                        case 1:
                            // wyswietlanie listy osób
                            for (int i = 0; i < persons.size(); i++) {
                                System.out.println(i + ": " + persons.get(i));

                            }
                            break;
                        case 2:
                            // wyświetlanie listy produktów
                            for (int i = 0; i < products.size(); i++) {
                                System.out.println(i + ": " + products.get(i).toString(true));
                            }
                            break;
                        case 3:
                            //pokaż koszyk
                            System.out.println("Podaj nr osoby");
                            k = Integer.parseInt(scan.next());
                            System.out.println(persons.get(k).getCurrent());

                            break;

                        case 4:
                            // nowy koszyk
                            System.out.println("Podaj nr osoby");
                            k = Integer.parseInt(scan.next());
                            persons.get(k).MakeOrder();
                            System.out.println("Utworzono nowy koszyk");
                            break;
                        case 5:
                            // historia koszyków
                            System.out.println("Podaj nr osoby");
                            k = Integer.parseInt(scan.next());
                            List<ShoppingCart> carts = persons.get(k).getHistory();
                            for(ShoppingCart c: carts)
                            {
                                System.out.println(c);
                            }
                            break;
                        case 6:
                            // dodanie produktu do koszyka
                            System.out.println("Podaj nr produktu");
                            j = Integer.parseInt(scan.next());
                            if (!products.get(j).IsAvailable()) {
                                System.out.println("Produkt nie jest dostępny");
                                continue;
                            }
                            System.out.println("Podaj nr osoby");
                            k = Integer.parseInt(scan.next());


                            persons.get(k).AddProduct(products.get(j));
                            System.out.println("Produkt został dodany");

                            break;
                        case 7:
                            // zapłać gotówką
                            System.out.println("Podaj nr osoby");
                            k = Integer.parseInt(scan.next());
                            persons.get(k).BuyInCash();
                            System.out.println("Zapłacono gotówką");
                            break;
                        case 8:
                            // zapłać kartą
                            System.out.println("Podaj nr osoby");
                            k = Integer.parseInt(scan.next());
                            persons.get(k).BuyByCard();
                            System.out.println("Zapłacono kartą");

                            break;
                        case 0:
                            // wyjście
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

        Main2 shop = new Main2();

    }

}
