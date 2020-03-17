package re.bm.core.lesson6;
//название
//количество страниц
//автор (имя, фамилия)
//можно ли брать домой
//доступна ли для выдачи
public class Book {
    private String title;
    private int pageCount;
    private Author author;
    private boolean isForHome;
    private boolean isInLibrary;

    public Book(){}

    public Book(String title) {
        setTitle(title);
    }

    public Book(String title1, int pageCount) {
        title = title1;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public boolean isForHome() {
        return isForHome;
    }

    public void setForHome(boolean forHome) {
        isForHome = forHome;
    }

    public boolean isInLibrary() {
        return isInLibrary;
    }

    public void setInLibrary(boolean inLibrary) {
        isInLibrary = inLibrary;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                ", isForHome=" + isForHome +
                ", isInLibrary=" + isInLibrary +
                '}';
    }
}
