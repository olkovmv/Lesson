package Enums;

import sun.util.resources.LocaleData;

import java.time.LocalDateTime;
import java.util.Locale;

public class Article {
private String title;
private String text;
private LocalDateTime created;
private  Country country;

    public Article(String title) {
        this.title = title;


    }

    public  Country getCountry(){
        return country;
    }

    public void setCoutry(Country country){
        this.country = country;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", created=" + created +
                ", country=" + country +
                '}';
    }
}
