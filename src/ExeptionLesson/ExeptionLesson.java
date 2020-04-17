package ExeptionLesson;

import ExamFarm.Farmer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOError;
import java.io.IOException;

public class ExeptionLesson {
    public static void main(String[] args) {
//        // Исключения и ошибки - это обьекты определенного типа данных
//        //Когда будем разбираться открыть интерфей serialzable
//        // Наследники класса eror нет смысла обрабатывать.  - Ошибки виртуальной машины (Что то
//        // не так написано, нужно что то менять. Обработать нет возможности
//        // Exeption - можно предугадать и можно обработать - некоторые просто обязаны обработать
//
//
//        ///Exeption - мы можем подельб на 2 группы
//        // 1. Обязаны обработать Не Runtime
//        // 2 Можем но не обязаны rutime
//
//        int a = 12;
//        int b = 0;
//        int res;
////        res = a/b; // runtimeexeption ArithmeticException
//
//        int[] arr = new int[3];// создали массив на 3 элемента
////        arr[89]= 12; //runtimeexeption ArrayIndexOutOfBoundsException
////        String string = null;
////        string.equals("Hello");   //runtimeexeption   NullPointerException
//
//
//        Object stringdata = "213";  // Нельзя обработать как строку(Доступны  толлько методы object
//        Integer someInteger;
////        someInteger = (Integer) stringdata;  // runtimeexeption ClassCastException (Проблемы приведения типов)
////        someInteger = (String) stringdata;
//
//
//        // Обработка исключений (Checked и unchecjed)
//        // Для обработки исключений использзуют try catch и блок finalyж
//
//        try {// в блок try помещается потенциально опасный участок кода,
//            //Код который модет привести к исключению
//            System.out.println("before a/b");
//            res = a / b; // Когда в блоке try происходит ArithmeticException //
//            // Управление переъодит в блок catch
//            System.out.println("After a/b");
//        } catch (ArithmeticException e) {  /// e - это переменная а ArithmeticException - тип данных
//            // Перечисляем инструкции, которые должны быть выполнены при ArithmeticException
//
//            // Блок перехватывает только то ,  который указан и никакие другие
//            System.out.println(e.getMessage());// сообщение об исключении
//            e.printStackTrace();// stackTrace
//            res = 1000;
//
//        }
//        System.out.println("after try catch");
//        System.out.println("res =  " + res);
//
//        // Обьединение catch блоков, если нудно обработать несколько исключений
//        //1 вариант
//        try {
//            if (System.currentTimeMillis() % 2 == 0)
//                someInteger = (Integer) stringdata;
//            else arr[77] = 100;
//        } catch (ClassCastException x) { // На данный момент времени перехватить тольлко его//
//            //И всех его потомков
//
//            System.out.println("Проблема рпиведения типов");
//        } catch (ArithmeticException l) {
//            System.out.println("Проблема с массивом");
//        }
//        //2 вариант: Все исключения обрабатываюьтся одинаковым способом
//        try {
//            if (System.currentTimeMillis() % 2 == 0)
//                someInteger = (Integer) stringdata;
//            else arr[77] = 100;
//        }catch (ClassCastException | ArithmeticException e){
//            // Перехватывает ClassCastException и всех его потомков
//            // Перехватывает ArithmeticException и всех его потомков
//            //
//            e.getMessage();
//            System.out.println("проблема с массив или приведением типов");
//        }
////
////        // 3 вариант: Яерез общего родителя (Через общий тип данных)
////        try {
////            if (System.currentTimeMillis() % 2 == 0)
////                someInteger = (Integer) stringdata;
////            else arr[77] = 100;
////        }catch (RuntimeException e){
////            System.out.println("Проблема с RuntimeException");
////            System.out.println(e.getMessage());
////            /// Перед тем как обработать надо подумать зачем
////
////        }
//
//        // 3 вариант: Яерез общего родителя (Через общий тип данных)
////        try {
////            if (System.currentTimeMillis() % 2 == 0)
////                someInteger = (Integer) stringdata;
////            else arr[77] = 100;
////        }catch (RuntimeException e){
////            System.out.println("Проблема с RuntimeException");
////            System.out.println(e.getMessage());
////            /// Перед тем как обработать надо подумать зачем
////
////        }catch (ClassCastException | ArithmeticException e)   Обработка идет по нисхоядщей по этому НЕВЕРНО
////

        //Блок Finally() Не является обязательным
//        finally {
//            //Код который тут находится выполнится в любом случае
//            //Исключения, даже если  оно не перехватывается в блоке catch
//            // В ЛЮБОМ СЛУЧАЕ ВЫПОЛНЯЕТСЯ
//            //Используется для закрытия ресурсов
//            //Недолжен содержать не обработанных исключений
//            // Весь код программы не кидаем
//            System.out.println("Finally");
//
//
//        }

        //Начнем генерировать исключения
        //Метод можем поместить в блок try
        //А можем не обрабатывать его

        voidWtichUncleExeprion(30);
        voidWtichUncleExeprion(10);
        try {//Метод генерирует исключение
            //ОБрабатывает  ипробрасываем на уровень выше
            voidChekExeption("asd.txt");
        }catch (IOException e){
            e.printStackTrace();
        }

        SomeMassage someMassage = null;
        String title = "Название";
        String text = "Текст";

            try {
                 someMassage = new SomeMassage("Название", "Текст");
            }catch (ChatExeption e){
                // допустим это привелор к exeption
               try {
                   voidChekExeption("File.txt");
               } catch (IOException ex) {
                   System.out.println("IOExeptiion " +ex.getCause());
                   ex.printStackTrace();
               }
            }

            //если обьект не создан следующий код приведет в nullPoimterExeption
        System.out.println(someMassage.getText());



    }
    private static void voidChekExeption(String s) throws IOException {
        if(s.endsWith("txt")){
            //генерируем и вбрасываем обрабатываемое исключени
            throw new IOException("Проблема с фалами");

        }
        System.out.println("s= " +s);
    }



    private static void voidWtichUncleExeprion(int a){
        if(a<15){
            // Герерируем и выбрасываем искючения
           throw  new IllegalArgumentException("Значение не должно быть меньше 15");

        }
        System.out.println("a = " + a);
    }
}
