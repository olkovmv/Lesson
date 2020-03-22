package re.bm.core.Samrab;

public class Main {
    public static void main(String[] args) {

        Volf volf = new Volf();
        Cat cat = new Cat();
        Maush maush = new Maush();
        cat.CanBEaten(volf);
        volf.canEat(cat);



    }
}