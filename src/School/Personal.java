package School;

public class Personal {
    public Personal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    protected String name;
    protected int vozrast;

    public Personal(String name, int vozrast) {
        this.name = name;
        this.vozrast = vozrast;
    }

}
// Учителя ищут ченика которые хоятт выучить их предмет
// Уровен знаний повышаетс япри обчении

