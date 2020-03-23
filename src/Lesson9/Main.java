package Lesson9;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Джава так стконструирова что у всех есть родительский класс
        // В данный момент класс Object
        // Object - родительский класс для всех
        // Методы доступны для использованяи и переопределния в дочерних классах

        Object object = new Object();
        // 1. toString() ыозвращает строковое представление обьекта

        Author author = new Author();
        author.setName("Иван");
        author.setSurName("Григорьев");

        ChildBook book1 = new ChildBook(new String[]{"dog", "cat"});
        book1.setTitlle("Детская книга");
        book1.setPageCount(230);
        book1.setAuthor(author);

        String stringbook = book1.toString();
        System.out.println(stringbook);


        //equels(Object other) - используется для сравнения обьектов
        // hachCode()  - возвращает hachcode обьекта

        ChildBook book2 = new ChildBook(new String[]{"dog", "cat"});
        book2.setTitlle("книга");
        book2.setPageCount(230);
        book2.setAuthor(author);

        boolean equalsBook = book1.equals(book2);
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(equalsBook);

        boolean equalsBook1 = book1.toString().equals(book2.toString());
        System.out.println(equalsBook1);
        /// Clone() - для создани копии обьекта

       // ChildBook cloneBook = book1; // Ссылка на один обьект

        ChildBook cloneBook = book1.clone();
        // Вариант 1 - использование базовой реализации
        // Класс должен реализировать интерфейс Cloneable
        // можно расширить модификатор доступа до public
        //
        System.out.println(book1.toString());
       //  Вариант 2 - без испоьзования базовой реализации
        // Класс не обзан реализовывать интерфейс Cloneable
        //






    }
}
