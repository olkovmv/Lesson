package re.bm.core.Samrab;


public class Cat implements CanEat, CanBeEaten {
    private String koshachi;




    @Override
    public void CanBEaten(CanEat canEat) {
        System.out.println("Кошечку скушали");

    }

    @Override
    public void canEat(CanBeEaten canBeEaten) {
        System.out.println("Кошечка скушала мышку");

    }
}
