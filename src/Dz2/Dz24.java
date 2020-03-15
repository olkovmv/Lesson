package Dz2;


import java.util.Scanner;

public class Dz24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       StringBuilder firstSt1 = new StringBuilder(str);
       StringBuilder firstSt2 = firstSt1.reverse();
       System.out.println(firstSt2);
        if (firstSt2.toString().equals(str)) {
           System.out.println("Вы ввели это странное слово");
       }
        else System.out.println("Неверное слово"); return;
            }





        }



