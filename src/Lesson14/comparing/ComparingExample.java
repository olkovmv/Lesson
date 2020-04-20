package Lesson14.comparing;

public class ComparingExample {
    public static void main(String[] args) {
        Car blackOpel = new Car("black", "opel", 2000);
        Car redOpel = new Car("red", "opel", 2500);
        Car yellowMazda = new Car("yellow", "mazda", 3000);
        Car greenMazda = new Car("green", "mazda", 3000);


        System.out.println("----list----");
        System.out.println("-----LinkList---");
        //Особенности
        // 1. В порядке добавления
        // Можно добавить NULL
        // Хранение дублирующих элементов
        // LinkList используется гораздо реже чем ArryList

        LinkedList<Student> linkedList = new LinkedList<>();



        System.out.println("---ArrayList----");
    }
}
