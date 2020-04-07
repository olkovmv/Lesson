package Zadachki.MinMax;

import com.sun.imageio.plugins.jpeg.JPEGImageWriterSpi;

import java.sql.Array;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {

        double[] arr = new double[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 80 + 20;

        }
        System.out.println(Arrays.toString(arr));

        double max = arr[0];
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Максимальное число массива " + max);
        System.out.println("Минимальное число массива " + min);
    }
}