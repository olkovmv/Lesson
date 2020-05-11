package lesson19.serialization;


import java.io.Serializable;

public class Group  implements Serializable {
    private String title;
    private int maxKnowledge;

    public Group(String title, int maxKnowledge) {
        this.title = title;
        this.maxKnowledge = maxKnowledge;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxKnowledge() {
        return maxKnowledge;
    }

    public void setMaxKnowledge(int maxKnowledge) {
        this.maxKnowledge = maxKnowledge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;

        Group group = (Group) o;

        if (maxKnowledge != group.maxKnowledge) return false;
        return title != null ? title.equals(group.title) : group.title == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + maxKnowledge;
        return result;
    }


    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                ", maxKnowledge=" + maxKnowledge +
                '}';
    }
}
