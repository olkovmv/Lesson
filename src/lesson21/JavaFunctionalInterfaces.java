package lesson21;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.function.*;

public class JavaFunctionalInterfaces {
    public static void main(String[] args) {
        // Интерфей Predicate<T>
        // предпологает проверку t на соответсвие услови/
        // У нео есть один амбтсракный метод
        // boolen test(t t);


        //Реализация метода test;
        Predicate<Integer> pos1 = num -> num > 0;
        System.out.println(pos1.test(32));

        Predicate<Integer> pos2 = num -> num < 0;
        System.out.println(pos2.test(12));

        Predicate<Integer> pos3 = num -> num % 2 ==0;
        System.out.println(pos3.test(44));


        System.out.println(pos1.and(pos2).test(22));
        System.out.println(pos1.or(pos2).test(3333));

//        boolean test (Integer num){
//            return num > 0;
//        }



        //Реализация метожа R apply(T t)
        Function<Integer, Double> tenPercent = num -> num * 0.1;
        Function<Integer, Integer> plusTen = num -> num + 10;
        Function<Integer, Integer> plusTFive = num -> num + 5;
        System.out.println(plusTen.apply(43));

        double doubleRes = plusTen.andThen(plusTFive).andThen(tenPercent).apply(13);
        System.out.println("doubleRes " + doubleRes);


        Function<Integer, Integer> two = num -> num * 2;
        Function<Integer, Integer> sqr = num -> num + num;
        int intRes = two.andThen(sqr).apply(3);
        System.out.println("IntREs #1 " + intRes);

        intRes =  two // Выолняется под номером №3( Как основное действие)
                .compose(sqr) // Выполняется ДО основного действия №1
                .andThen(sqr) // Выполняется ПОСЛЕ основного действия №4
                .compose(sqr) // Выполняется ДО основного действия №2
                .apply(32); // Выполняется ПОСЛЕ основного действия №5

        Function<Integer, String> busck = num -> num + "$";
        System.out.println(busck.apply(12));

        Predicate<Integer> cond = num -> num > 0;
        Function<Integer, Integer> func =
                getFunction(cond, plusTen, plusTFive);
        System.out.println(func.apply(5));


    }

    static  Function<Integer, Integer> getFunction(
            Predicate<Integer> condition, Function<Integer, Integer> ifTrue, Function<Integer, Integer> ifFalse
            ){
        return num -> condition.test(num) ? ifTrue.apply(num) : ifFalse.apply(num);

    }

    //BinaryOperator<T> T apply (T t1, T t2);
    // UnaryOperator <T> apply (T t1);
//    BiConsumer<T, R>: void accept (T t, R r);
//    Consumer<T>: void accept (T t);


}
