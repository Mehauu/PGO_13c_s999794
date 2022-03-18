package G13c_CW1;
import java.util.Arrays;
import java.util.Random;

public class Zad6 {

    public static void main (String[] args) {
        int[] arr = new Random().ints(10, 100, 1000).toArray();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        print(arr);
    }

    private static void print (int[] arr){
        System.out.println(Arrays.toString(arr));

    }
}

