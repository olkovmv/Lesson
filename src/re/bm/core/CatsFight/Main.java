package re.bm.core.CatsFight;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Pups");
        Cat cat2 = new Cat("Buzu", 7);
        Cat cat3 = new Cat("Ruzik", 10, 15);
        Cat cat4 = new Cat(10, "Blo");
        Cat cat5 = new Cat(10, "Blo", "Komendanskii 51");
        cat1.setZdorovie(25);
        cat2.setZdorovie(13);
        cat3.setZdorovie(12);
        cat4.setZdorovie(14);
        cat5.setZdorovie(15);
        cat1.setSilaUd(11);
        cat2.setSilaUd(33);
        cat3.setSilaUd(42);
        cat4.setSilaUd(41);
        cat5.setSilaUd(12);

        cat1.fight(cat5);
        cat5.fight(cat3);




    }
}
