package Primit;

import java.lang.reflect.Array;

public class PrimitiveWrapper {
    public static void main(String[] args) {
//        int num;
//        PrimitiveWrapper.sqr(21);
//    }
//
//        private static void sqr(Integer num){
//            System.out.println(num * num);
//        }
//
//        private static  void kons(Double[] newArr) {
//            for (Double d : newArr) {
//                System.out.println("" + d);
//            }
//
//
//            double[] doubles = {3.42, 23.4, 31.54, 43};
//            Double[] doubles1;


            // Методы оберток

            Integer num = 32;
            num.byteValue();
            num.byteValue();
            num.intValue();

            System.out.println(Byte.parseByte("2"));
            System.out.println(Integer.parseInt("2244")); // int
            System.out.println(Integer.valueOf("3232"));

            //Строка должна содержать только число


        Integer inegers = 3223;
        System.out.println(inegers.toString());


        Integer first = 45;
        Integer second = 23;

        System.out.println(first.equals(second));
        System.out.println(first.getClass());
        System.out.println(first.compareTo(second));


        Integer first1 = 452;
        Integer second1 = 233;
        System.out.println(first == second);




        }}