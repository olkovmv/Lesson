package Dz2;

import java.util.Arrays;
import java.util.Scanner;

public class Dz26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gor = sc.nextLine();
        String[] mas = gor.split(" ");
        Arrays.sort(mas);
        System.out.println("Вывод городов по алфавиту " + Arrays.toString(mas));



    }
}
