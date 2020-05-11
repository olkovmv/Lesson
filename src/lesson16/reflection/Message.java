package lesson16.reflection;

import java.time.LocalDateTime;

public class Message {
    public String title;
    private LocalDateTime created;

    public Message(String title) {
        this.title = title;
        created = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
