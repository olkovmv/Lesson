package Lesson9;

import java.util.Objects;

public class Book {
    // private - Только внутри класса!!!!!!!!!
    //protected - Внутри пакета и внутри класса и внутри дочерних классов!!!!!!!!
        protected String title;
        protected int pageCount;
        protected Author author;

    public String getTitlle() {
        return title;
    }

    public void setTitlle(String titlle) {
        this.title = titlle;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pageCount, author);
    }
}
