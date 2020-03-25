package ExamFarm;

import org.w3c.dom.ls.LSOutput;

public class Rabbit extends PetAnimal implements ToBeEaten {

    public Rabbit(String name, int weight, int speed, int health, int resourrces) {
        super(name, weight, speed, health, resourrces);
    }

    public Rabbit() {}




    @Override
    public void toBeEaten() {
        System.out.println("Кролик сьеден");

    }
}
