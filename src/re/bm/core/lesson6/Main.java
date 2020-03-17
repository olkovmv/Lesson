package re.bm.core.lesson6;

public class Main {
    // библиотека:
        // можно добавлять книги по 1й или несколько сразу
        // можно взять книгу (указав автора)
        // домой / для чтения в библиотеке
    // книги:
       /*
       название
        количество страниц
        автор (имя, фамилия)
        можно ли брать домой
        доступна ли для выдачи
        */
    public static void main(String[] args) {
        Author author1 = new Author();
        // доступ к свойству
//        author1.name = "";
//        System.out.println(author1.name);
        // вызов метода
        author1.setName("Брюс");
        author1.setSurname("Эккель");
        System.out.println(author1.getName());

        Author author2 = new Author();
        // доступ к свойству
//        author2.name = "";
//        System.out.println(author2.name);
        author2.setName("Роберт");
        author2.setSurname("Мартин");
        String name = author2.getName();
        System.out.println(name);
//        System.out.println(author2.toString());
        System.out.println(author2);


        Book book1 = new Book("Философия Java");
        System.out.println(book1);
        book1.setPageCount(1350);
        book1.setAuthor(author1);
        book1.setForHome(true);
        System.out.println(book1);

        Book book2 = new Book("Чистый код", 500);
        System.out.println(book2);
        book2.setAuthor(author2);
        System.out.println(book2);

        String book1AuthorName = book1.getAuthor().getName();
        System.out.println(book1AuthorName); // Брюс


        /*ссылочные типы - null
        целые числа - 0
        boolean - false
        числа с плавающей точкой - 0.0 */


        Book[] books = {book1, book2};
        // фамилия автора для каждой книги
        for (Book book: books) {
            System.out.println(book.getAuthor().getSurname());
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getAuthor().getSurname());
        }




        Library library = new Library();
        library.addBook(book1, book2);

    }

}
