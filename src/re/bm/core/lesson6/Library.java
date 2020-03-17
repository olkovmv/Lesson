package re.bm.core.lesson6;
// библиотека:
// можно добавлять книги по 1й или несколько сразу
// можно взять книгу (указав автора)
// домой / для чтения в библиотеке
public class Library {
    private String name = "Библиотека";
    private Book[] books = new Book[5];

    public String getName() {
        return name;
    }

    // добавление одной книги
    public void addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                newBook.setInLibrary(true);
                books[i] = newBook;
                break; // return;
            }
        }
    }

    // добавление нескольких книг
    public void addBook(Book ...newBooks){
//        newBooks - массив
        // TODO: реализация метода

    }

    public Book getHome(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null &&
                    books[i].getTitle().equals(title) &&
                    books[i].isForHome() &&
                    books[i].isInLibrary()
            ) {
                books[i].setInLibrary(false);
                return books[i];
            }
        }
        return null;
    }





}
