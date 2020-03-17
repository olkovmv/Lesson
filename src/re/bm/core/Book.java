package re.bm.core;

public class Book<autor> {
    private String title;
    private int pageCount;
    private Autor autor;
    private boolean idForHome;
    private boolean isInLibraty;

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isIdForHome() {
        return idForHome;
    }

    public void setIdForHome(boolean idForHome) {
        this.idForHome = idForHome;
    }

    public boolean isInLibraty() {
        return isInLibraty;
    }

    public void setInLibraty(boolean inLibraty) {
        isInLibraty = inLibraty;
    }

    public Book(String title, int pageCount) {
        this.title = title;

    }

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", autor=" + autor +
                ", idForHome=" + idForHome +
                ", isInLibraty=" + isInLibraty +
                '}';
    }
}
