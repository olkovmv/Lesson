package ExamFarm;

public class Cow extends PetAnimal implements GiveResources, ToBeEaten {

    public Cow(String name, int weight, int speed, int health, int resourrces) {
        super(name, weight, speed, health, resourrces);
    }

    public Cow() {}





    @Override
    public void GiveResourc() {
        System.out.println("Корова дает молоко");



    }

    @Override
    public void toBeEaten() {
        System.out.println("Корова сожрана");

    }
}
