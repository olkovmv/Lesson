package Dz2;

import java.io.StringReader;
import java.util.Arrays;

public class Dz23 {
    public static void main(String[] args) {
        String firstSt1 = "Стих стиховедческий термин используемый в нескольких значенияхически";
        String firstSt2 = "Стих стиховедческий термин как только я смогу используемый в нескольких  или нет значенияхически";
        String[] ArrSt1 = firstSt1.split(" ");
        String[] ArrSt2 = firstSt2.split(" ");

        int kolChisel = 0;
        boolean proverka = ArrSt1[0].equals(ArrSt2[0]);
        System.out.println(proverka);


        System.out.println(Arrays.toString(ArrSt1));
      System.out.println(Arrays.toString(ArrSt2));
      for (int i = 0; i < ArrSt1.length; i++) {
           for (int j = 0; j < ArrSt2.length; j++) {
               if (ArrSt1[i].equals(ArrSt2[j])) {
                   kolChisel++;

             }
          }

        }
        System.out.println(kolChisel);

    }

}