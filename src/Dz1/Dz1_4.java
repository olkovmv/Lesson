package Dz1;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

public class Dz1_4 {
    public static void main(String[] args) {

        Scanner ch = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int n=0;

        while (n <= 3) {
            if(ch.hasNextInt()){
                n = ch.nextInt();
                if(n <= 3){
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                ch.next();
            }
        }
        int [] Arr1 = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            Arr1[i] = (int)(Math.random()*(n+1));
            if(Arr1[i]%2 == 0){
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(Arr1));
        int [] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(Arr1[i]%2 == 0){
                mas2[index] = Arr1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}