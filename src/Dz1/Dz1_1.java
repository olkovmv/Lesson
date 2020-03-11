package Dz1;

import java.util.Scanner;

public class Dz1_1 {
        public static void main(String[] args) {
            int firsStep, secondStep, threeStep, ostDel = 1;
            Scanner in = new Scanner(System.in);
            System.out.println("Введите певрое число");
            int num = in.nextInt();
            System.out.println("Введите второе число число");
            int num2 = in.nextInt();
            if (num> num2)
            {
                firsStep=num%num2;
                secondStep = num2%firsStep;
                threeStep=firsStep%secondStep;
                if (threeStep==0) {ostDel = secondStep;}
            }
            else if (num2>num) {
                firsStep = num2/num;
                secondStep = num%firsStep;
                threeStep=secondStep%firsStep;
                if (threeStep==0) {
                    ostDel = firsStep;
                }
                System.out.println(ostDel);
            }

        }
    }


