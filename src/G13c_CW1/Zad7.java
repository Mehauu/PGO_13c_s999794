package G13c_CW1;
import java.util.Scanner;
public class Zad7 {
    public static void main(String[] args) {
        int c = 0;
        do {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Podaj liczbę n");
            int n = sc1.nextInt();
            if (n >= 5 && n % 2 != 0) {
                c++;

                System.out.print("Liczba poprawna");
                System.out.println();

                int a, b;
                for (a = 1; a <= n; a++) {

                    for (b = 1; b <= n; b++) {

                        if (a == 1 || a == n || b == 1 || b == n
                                || a == b)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Liczba niepoprawna");
            }}
        while (c < 1) ;
    }
}
