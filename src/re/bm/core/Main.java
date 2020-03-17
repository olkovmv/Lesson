package re.bm.core;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    //Библиотека
    //Для каждой книги указать названиеё//количество страниц//автор(имяб фамилия)

    ///Можно ли брат книгу долмой
    // Доступна ли она сейчас
    //Можно добавлять по одной или нескоько книг//
    //Можно вщять книгку (Указав автора) домой// почитать в библиотеке


    public static void main(String[] args) {
        Autor autor1 = new Autor();
//        autor1.name = "Борис";
//        autor1.surname = "Романов";
//        System.out.println(autor1.name + " " +  autor1.surname);

        autor1.setName("Борис");
        autor1.setSurname("Романов");
        System.out.println(autor1.getName() + " " + autor1.getSurname());


        Autor autor2 = new Autor();
//        autor2.name = "Роман";
//        autor2.surname = "Белогуров";
//        System.out.println(autor2.name + " " +  autor2.surname);
        autor2.setName("Николай");
        autor2.setSurname("Белогуров");
        System.out.println(autor2.getName() + " " + autor2.getSurname());


        Book book1 = new Book("Философия джава");
        System.out.println(book1);

        System.out.println(autor1.toString());

        // Обьект создается с со значения по умолчанию


        Book book2 = new Book("Джава", 123);

        book1.setPageCount(1350);
        book1.setIdForHome(true);
        book1.setAutor(autor1);


        book2.setAutor(autor1);

       String book1Autor = book1.getAutor().getName();
        System.out.println(book1Autor);












        Book[] books = {book1, book2};
        for (int i = 0; i < books.length ; i++) {
            System.out.println(books[i].getAutor().getSurname());

        }


    }
}
