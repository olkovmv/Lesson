package Dz2;

import java.util.Arrays;
import java.util.Scanner;

public class Dz22 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите предложение");
        String firstSt1 = "Стих стиховедческий термин используемый в нескольких значенияхически"; //vvod.nextLine();
        String[] slovo = firstSt1.split(" ");

        String perSlovo = slovo[0];
        System.out.println(Arrays.toString(slovo));
        for (int i = 0; i <slovo.length ; i++) {
                if (perSlovo.length() < slovo[i].length()){
                    perSlovo = slovo[i];
                }

        }
        System.out.println(perSlovo);

    }
}
