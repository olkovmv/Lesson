package Lesson2;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        Тема циклы (Циклы ахуенные)
//        While
//        while (Уловие) { Тело цикла
//        }
//       Пользователь вводит целое число с клавиатуры
//        Необходимо вывести число на * на себя
//        Цикл прерыввает работу/ если пользователь ввел 0

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите целое число");
            int num = in.nextInt();
            if (num == 0) {
                System.out.println("Выходим из программы");
                break;
            } else {
                System.out.println(num * num);
            }
        }
        int programNum = (int) (Math.random() * 6) + 1;
        while (true) {
            System.out.println("Введите число от 1 до 6");
            int num1 = in.nextInt();


            if (num1 == 0) {
                System.out.println("Супер ты ахуенный выхожи из программы");
                break;
            } else if (num1 < programNum) {
                System.out.println("Ваше число меньше");
            } else if (num1 > programNum) {
                System.out.println("Ваше число больше");
            } else if (num1 == programNum) {
                System.out.println("Супер ты ахуенный выхожи из программы");
                break;
            } else if (num1 > 6 && num1 < 0) {
                System.out.println("Ты не попал в диапозон - повтори");
            }
        }

//        For (Fori + enter)
//        Вывести в консоль все числа от 0 до 19
        for (int i = 0; i <= 19 ; i++) {//fori    Блок инициализации ->проверка условия и далее цикл
            if (i%2 != 0) continue; // Переходим на следующую операцию

            System.out.println(i);

        }
    }
}

