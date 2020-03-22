package re.bm.core.Samrab;

public class Volf implements CanEat{
    private String psovie;

    public Volf() {

    }


    @Override
    public void canEat(CanBeEaten canBeEaten) {
        System.out.println("Волк скушал мелкое животное");
    }
}
