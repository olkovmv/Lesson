package Lesson3;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.beans.binding.StringBinding;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class StringLesson {
    public static void main(String[] args) {
        //Строки - ссылочный тип даных/
//        //До 9 версии зыка
//        char charVar = 'e';
//        char[] = {'s', 'd', 'f'};
//        "sdf" - хранится как массив char
//        utf16
//        Каждый символ занимает 2 байта
        String someStr = "Первая строка";

        //После 9 версии языка
//       Строки хранятся как массив байт
//        utf16
//        Latin1

        String someStr1 = "Первая строка"; // Добавление через пул строк
        String someStr2 = "Первая строка";
        String someStr3 = new String("Первая строка"); //Задействует две области памяти
        String someStr4 = new String("Первая строка");
        //сравнение строк
        System.out.println(someStr1==someStr2);
        System.out.println(someStr3==someStr4);
        System.out.println(someStr3.equals(someStr2)); // Сравнивать тлько этим методом


        String newString = new String("new");
        String newString2 = newString.intern(); // Помещает строку в пул строк
//          Строки в языке не меняются
//        конкатенция строк
//
        String str1 = "Строка 1 ";
        String str2 = "Строка 2";
        String str3 = "Строка 3";

        str1=str1+"+" +str2;
        System.out.println(str1);

        str2=str2.concat(str3).concat("Hello").concat("STR"); ///Каждый вызов метода - дополнительная строка в пуле

        System.out.println(str2);


        str3 = String.join(",", str1, str2, str3);
        System.out.println(str3);

        str1 = "Строка ";
        for (int i = 0; i <10 ; i++) {
            str1+="Интерация " + i;

        }
        System.out.println(str1);

        //Возможность изменять строки дают обьекты
//        StringBuilder - Работает быстрее, но не потокобезопасен
//        StringBuffer - Потокобезопасен но работает медленнее


        str1 = "Строка ";
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append("Hello").append("bos");
        System.out.println(sb);

        for (int i = 0; i <10 ; i++) {
            sb.append(" итерация ").append(i);
        }
        System.out.println(sb);
        str1 = sb.toString();
        System.out.println(str1);


        char[] charArr = {'q', 'd', 'a', 'f', 'j'};
        String charStr = new String(charArr);
        System.out.println(charStr);
        byte[] bytes = charStr.getBytes();
        System.out.println(Arrays.toString(bytes));
        charStr = new String((bytes));
        System.out.println(charStr);


        //Сравнение строк
        str1 = "jaVa";
        str2 = "java";
        System.out.println(str1.equals(str2)); // с учетом регистра
        System.out.println(str1.equalsIgnoreCase(str2)); // без учета регистра

        System.out.println((str1.compareTo(str2)));
        System.out.println((str1.compareToIgnoreCase(str2)));
        System.out.println((str2.compareTo(str1)));

        System.out.println(str1.startsWith("Ja")); //Проверка начала страны
        System.out.println(str1.endsWith("А")); //Проверка окончания

        str1= str1.toLowerCase(); //Привести к нижнему регистру
        System.out.println(str1);
        str1=str1.toUpperCase(); // ПРиветчи к верхнему регичтру
        System.out.println(str1);



        str1 = "                    Строка                              ";
        System.out.println(str1);
        System.out.println(str1.trim()); //Убирает пробелы вначале и конце


        str1 = "    Стр    ";
        System.out.println(str1.length());
        System.out.println(str1.trim().length());

        str1 = "Java";
        System.out.println(str1.replace("a", "AAAAA"));

        str1 = "java Junior";
        String[] strings = str1.split("\\s");
        System.out.println(Arrays.toString(strings));


        //Почитать про регулярки
    }
}
