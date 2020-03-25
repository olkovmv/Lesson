package ExamFarm;

public class WildAnimals extends Animal {
    private int force;

    public WildAnimals(String name, int weight, int speed, int force) {
        super(name, weight, speed);
        this.force = force;
    }

    public WildAnimals(){}


    private void animalAttac(){

        System.out.println("Дикое животное напало на домашнее");
        if (PetAnimal.speed > WildAnimals.speed ) {
            System.out.println("Домашнее животное убегает от дикого");
        } else if(PetAnimal.speed < WildAnimals.speed && PetAnimal.health > 0) {
            System.out.println("Домашнее животное ранено, но не убито");
        } else {System.out.println("Домашнее животное сдохло");}
    }

}
