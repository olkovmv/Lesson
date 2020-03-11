package lesson1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FirstLesson {

    //Я могу комментировтаь как хочу
//    Не вижу проблемы написать какую нибудь гадость
    /* Бля я снова впискался в эту тему
    * Ну если не получится  -  ну ок
    * */
    public static void main(String[] args) {
//        Типы данных
//        1. Примитивные типы данных
//        2. Ссылочные типы данных
//                  Примитивные типы данных
        // byte 1 байт, используется для хранения даннфх от - 128 до 127;
        byte byteVar, byteVar2, byteVar3; //Обьявили переменные
        // Крутая приблуда, копирование строки по ком + D
        byteVar = 23;
        byteVar2 = 36;


        // short -  2 байта, используется для хранения данных от - 32768 до 32767
        short shortVar = 12245;


        //int - 4 байта, используется для хранения данных
        int intVar1 = 100;
        int intVar2 = 2_000_000;
//        int zeroDevision = intVar1 / 0;

        short shortVar3 = 300;
        short shortVar4 = 200;
        short shortVar5 = 600;
        int shortSum = shortVar3 + shortVar4 + shortVar5;


// Забыл про тебя братан.  8 байт Ты же саммый самый большой тип данных. Самыйкрутой  и беспощадный
        long longVar;
//        longVar = 2340494; Так воспринимается как int
        longVar = 2340494L;

            //float = 4 байта
            //double = 8 байт
        float floatVar = 5.7f;
        float floatVat1 = floatVar/0;
        //sout - не забыть как сокращенно писать System.out.println();
        System.out.println(floatVat1); // - Infinity  - бесконечность( необхомо ее будет обработать)



        double dobleVar = 32.5;
        double dobleVar1 = dobleVar / 0;
        System.out.println(dobleVar1); // - Infinity  - бесконечность( необхомо ее будет обработать)

        // Дома кто не знает. Числа с плавающей точкой все дела. Почему на нее нельзя полагаться.
        //// TODO: 02.03.2020
        // TODO: 02.03.2020
        // FIXME: 02.03.2020

        //char = 2 байта. Хранит номер символа в таблице unicode (UTF -16)
        // boolean  принимает два значения либо true, либо false.

        boolean isActive = true;
        boolean isClose = false;
//      Приведение типов данных. Существует два типа.
//        1. Автоматическое приведенние данных.
        byte someByte = 10;
        int someInt = someByte;

//        2.    Явное приведение типов
        someInt = 100;
        someByte = (byte)someInt;

        //операторы
        //Операторы присваивания
        // Когда мы присваиваем какие либо значения
        // = | += | -= | += | /= | %= |
//        Допустим
         int a = 10;
         a += 7; // a = a + 7;
//         Арифметические операции
//        + | - | * | / | % - взфтие остатка от деления
        // 7%2 = 1;
        // 7/2 = 3;

         a = 12;
        int b = 7;
        double b1 = b;
        int c = a/b;
        System.out.println(c);
        double c1 = a/b1;
        System.out.println(c1);


        // Операторы сранвнеия
        // > | < | >= | <= | != (Неравненство) | == (Равенство)
// Результатом сравнения может быть boolen либо true либо false;
        int varAd = 9;
        int varAda = 10;
        // инкремент (Увеличивает на 1)
        // i++ (Префиксная) +ii (Постфиксная)
        // Дикремент ( Уменьшает на 1)
        //i-- --i
//        Консольный вывод

//        sout
        System.out.println("Выводимая информация");
        System.out.print("Выводимая информация продолжение строки");

//        souf
        System.out.printf("Формотированный вывод %s \n", "данных");
        // %f для вывода чисел с плавающей точкой
        // %d для вывода целых чисел
        // %s для вывода строк

//  Консольный ввод
        Scanner in  = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        System.out.printf("Вы ввели %s\n", number );
// Логические операторы
        // Применяются к boolen переменным , либо выражениямю
        // && И
        // || Или
        // ! НЕ
        // ^ Исключающее или


//        Тернарный оператор
//        переменная = (условие) ? выражение 1 : выражение 2;
        a = 2;
        b = 4;
        c = a > b ? a + b : a - b;
        System.out.println(c);

// дана переменная типа int
        // четная / 2
        // нечетна  *2

        int intProb, intOp1;
        intOp1 = 10;

        intProb = (intOp1 % 2 == 0) ? intOp1 /2 : intOp1 *2;
        System.out.println(intProb);

        



        }
}
