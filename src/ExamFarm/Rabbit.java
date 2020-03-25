package ExamFarm;

public class Rabbit extends PetAnimal implements ToBeEaten {
    public Rabbit(String name, int weight, int speed, int health) {
        super(name, weight, speed, health);
    }

    public Rabbit() {}




    @Override
    public void toBeEaten() {

    }
}
