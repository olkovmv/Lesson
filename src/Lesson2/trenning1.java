package Lesson2;

import java.util.Arrays;
import java.util.Random;

public class trenning1 {

    public static void main(String[] args) {
        int[] arrDom1 = new int[10];
        int[] arrDom2 = new int[8];






        for (int i = 0; i < arrDom1.length; i++) {
            for (int j = 0; j < arrDom2.length; j++) {
                arrDom1[i] = j+i;
                System.out.println(Arrays.toString(arrDom1));
            }
        }
        System.out.println(Arrays.toString(arrDom1));
    }
}