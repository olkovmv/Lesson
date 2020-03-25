package ExamFarm;

public class PetAnimal extends Animal {
    private int health;

    public PetAnimal(String name, int weight, int speed, int health) {
        super(name, weight, speed);
        setHealth(health);
    }
    public PetAnimal(){}

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health> 0){this.health = health;}
    }





    private void runAway(){
        System.out.println("Животное убежало от дикого зверя");
    }

    private void restoresHealth(Farmer feedPet){ ////Непонял как написать - нужно обдумать
        System.out.println("Животное восполнило здоровье");
    }


}
