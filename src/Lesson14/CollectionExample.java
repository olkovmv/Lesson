package Lesson14;


import java.util.LinkedList;

public class CollectionExample {
    public static void main(String[] args) {
        Student student1 = new Student("Петр", "Алексеев", 18);
        Student student2 = new Student("Екатерина", "Еремина", 20);
        Student student3 = new Student("Денис", "Попов", 22);
        Student student4 = new Student("Петр", "Попов", 22);

        // в java существует несколько реализаций коллекций (все они имплементирую интерфейс Collection) и различаются:
        // безопасностью использования в многопоточых срадах,
        // возможностью хранить дублирующиеся элементы,
        // возможностью хранить элементы в отсортированным виде,
        // скоростью добавления, удаления, извлечения элементов из начала / середины / конца коллекции
        // возможностью хранить элементы в том порядке, в котором они были добавлены и тд

        // Коллекции, которые необходимы для работы в многопоточных средах мы рассмотрим в теме по многопоточности.
        // Все коллекции, которые будут рассмотрены в lesson14 не являются потокобезопасными

        // все коллекции - дженерики, при создании объекта коллекции
        // в <> необходимо указать объекты какого типа Вы собираетесь в ней
        // хранить

        System.out.println("---List---");
        System.out.println("---LinkedList---");
        // Особенности LinkedList:
        // 1. элементы хранятся в порядке добавления
        // 2. можно хранить null
        // 3. допускает хранения дублирующихся элементов

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(student1); // добавление элемента в конец списка
        studentLinkedList.add(student2); // добавление элемента в конец списка
        studentLinkedList.add(student1); // добавление элемента в конец списка



        System.out.println("---ArrayList---");

        System.out.println("----list----");
        System.out.println("-----LinkList---");
        //Особенности
        // 1. В порядке добавления
        // Можно добавить NULL
        // Хранение дублирующих элементов
        // LinkList используется гораздо реже чем ArryList

        LinkedList<Student> studentlinkedList = new LinkedList<>();
        studentlinkedList.add(student1);
        studentlinkedList.add(student2);
        studentlinkedList.add(student1);




        System.out.println("---ArrayList----");


    }
}
