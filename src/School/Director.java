package School;

public class Director extends Personal {

    public Director(String name, int vozrast) {
        super(name, vozrast);
    }

    protected void obiaNachZan() {
        System.out.println("Директор объявляет начало занятий");
    }

    protected void obiaOkonZan() {
        System.out.println("Директор объявляет окончание занятий");
    }


}
