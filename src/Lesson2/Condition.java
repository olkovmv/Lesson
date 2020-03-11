package Lesson2;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_INPeer;
import com.sun.tools.internal.xjc.model.CDefaultValue;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Condition {

//    Public класс может быть только один в папке.  PSVM!!! Не забывай об хэтом


    public static void main(String[] args) {
//        if, else
//        if (условие) { Выполняем какой нибудь действие = true;}
//        else if (Проверка уловия другого) {Выполняем какой нибудь действие = true;}
//        else  {Выполняем какой нибудь действие = false;}
//


//        Поправить текст com + alt + l

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число if,else");
        int minute = in.nextInt();
        if (minute >= 0 && minute < 15) {
            System.out.println("Вы попали в первую четверть");
        } else if (14 < minute && minute < 31) {
            System.out.println("Вы попали во вторую четверть");
        } else if (minute > 29 && minute < 46) {
            System.out.println("Вы попали в третью четверть");

        } else if (minute > 45 && minute < 60) {
            System.out.println("Вы попали во вторую четверть");
        } else {
            System.out.println("Данное число не попадает к нам. Введите от 0 до 59");
        }


//        Switch (){}

        System.out.println("Введите число switch");
        int code = in.nextInt();
        //111 / 222 / 333 - > "Малый приз"
        //444 / 555 - > "Средний  приз"
        //777 - > "Большой  приз"
        // - >  "Попробуйте еще раз"
        switch (code){
            case 111:
            case 222:
            case 333:
                System.out.println("Малый приз");
                break;
            case 444:
            case 555:
                System.out.println("Средний приз");
                break;
            case 777:
                System.out.println("Большой  приз");
                break;
            default:
                System.out.println("Братан тебе не повезло");
        }

        //switch 12/13 java
//
//        int code1 = 333;
//        switch (code1) {
//            case 111, 222, 333 -> System.out.println("Малый приз");
//            case 444, 555, -> System.out.println("Малый приз");
//            case 777 -> System.out.println("Малый приз");
//            default: -> System.out.println("Братан тебе не повезло");
//
//        }

//        String prize = switch (code) {
//            case 111, 222, 3333 -> "Малый приз";
//            };
//        default -> {String someRes = "Попробуйте еще раз";
//        yield someRes; //13
//        break someRes//12 }
    }

}
