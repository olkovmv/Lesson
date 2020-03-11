package Dz1;
import java.util.Arrays;
import java.util.Random;

public class Dz1_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] Array = new int[7];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = rand.nextInt();
            Arrays.sort(Array);


        }
        System.out.println(Arrays.toString(Array));
        int min = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < min) {
                min = Array[i];
                System.out.println(min);
                break;
            } else System.out.println(Array[i] == min);
            System.out.println(min);
            break;

        }
        int max = Array[6];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
                System.out.println(max);
                break;
            } else System.out.println(Array[i] == max);
            System.out.println(max);
            break;

        }
    }
}