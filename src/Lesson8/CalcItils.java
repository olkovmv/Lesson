//package Lesson8;
//
//
//// Оператор final с классом запрезает наследование
//// От данного класса
//
//
//import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
//import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;
//
//public final class  CalcItils {
//// Значение final свойств должны быть установленны
//
//     final double PI_VAR;
//
//    public CalcItils(final double) {
//        PI_VAR = 3.14;
//    }
//        public final void someVoid(final int num, final Children.SomeClass sc, final int[] arr)
//        {
//            System.out.println(num);
//       //     num=90;
//            System.out.println(sc.name);
//            sc.name = "Новое имя";
////            sc = new Children.SomeClass();
//            arr[32] = 34;
//
//        }
//    }
//
//    // Наследование невозможно , тк CalcUtils
//// Определен как Final class
//        class Children extends CalcItils{
//        @Override
//        protected void finalize() throws Throwable {
//            super.finalize();
//        }
//        class SomeClass {
//            String name;
//
//        }
//
//
//
//        static final double PI;
//        public  static int summ (int a, int b) { // Из статических методов  нельзя обращаться к нестатическим методам и свойствам
//            return a+ b;
//        }
//
//        //Статика принадлежит классу
//        // Обслуживающие методы, дополнительные и вспомогательные
//        //Фабричные метолы
//        // КОторые создают обьект
//
//
//        //Статический блок
//
//        static {
//            PI=3.14;
//            // Когда класс загружается и статический блок загружается один раз
//        }
//
//
//    }
//
//
//
