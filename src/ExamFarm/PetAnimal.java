package ExamFarm;

public class PetAnimal extends Animal {
    private int health;

    public PetAnimal(String name, int weight, int speed, int health) {
        super(name, weight, speed);
        this.health = health;
    }
    public PetAnimal(){}





    private void runAway(){
        System.out.println("Животное убежало от дикого зверя");
    }

    private void restoresHealth(Farmer feedPet){ ////Непонял как написать - нужно обдумать
        System.out.println("Животное восполнило здоровье");
    }


}
