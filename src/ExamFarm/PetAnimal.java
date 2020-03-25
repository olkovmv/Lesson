package ExamFarm;

public class PetAnimal extends Animal {
    private int health;
    private  int resourrces;

    public PetAnimal(String name, int weight, int speed, int health, int resourrces) {
        super(name, weight, speed);
        this.health = health;
        this.resourrces = resourrces;
    }

    public int getResourrces() {
        return resourrces;
    }

    public void setResourrces(int resourrces) {
        this.resourrces = resourrces;
    }

    public PetAnimal(){}

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health> 0){this.health = health;}
    }





    private void runAway(WildAnimals animals){     ///Хрень какую то написал
        if(this.getSpeed()>animals.getSpeed()){
        System.out.println("Животное убежало от дикого зверя");
    }
        else {this.health = this.health - animals.getForce();}



    private void restoresHealth(){
            if ()////Непонял как написать - нужно обдумать
        }
        System.out.println("Животное восполнило здоровье");
    }


}
