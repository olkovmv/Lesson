package Dz1;

import javax.swing.*;

public class Dz1_2 {


    public static void main(String[] args) {
        int[] Arr1 = {32, 2, 13, 3, 43, 1321, 132, 543};
        int[] Arr2 = {32, 23, 4, 13, 43, 5, 132, 543};
        for (int i = 0; i < Arr1.length ; i++) {
            for (int j = 0; j <Arr2.length ; j++) {
                if(Arr1[i] + Arr2[j] == 7) {

                System.out.println("Первый номер " + Arr1[i]);
                System.out.println("Второй номер " + Arr2[j]);
                break;
                }

            }

        }
    }
}
