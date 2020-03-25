package ExamFarm;

public class Hen extends PetAnimal implements GiveResources, ToBeEaten {

    public Hen(String name, int weight, int speed, int health) {
        super(name, weight, speed, health);
    }

    public Hen() {}

    @Override
    public void GiveResourc() {

    }

    @Override
    public void toBeEaten() {

    }
}
