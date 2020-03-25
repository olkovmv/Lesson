package ExamFarm;

public class Farmer {
    private  int resources = 5;

    public Farmer(int resources) {
         setResources(resources);
    }

    public Farmer(){}

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }




    private void GetResources(PetAnimal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof GiveResources) {
                resources += animals[i].getResourrces();
            }
        }
        System.out.println("Собирает ресурсы с домашних животных, которые могут давать ресурсы");
    }

    private void animalEats(PetAnimal[] animals) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof ToBeEaten) {
                    resources += animals[i].getWeight();
                }
            }
        System.out.println("Съедает домашнее животное, которое пригодно в пищу");
    }

    private void animalAway(WildAnimals[] animals) {   ///Короче надо дома обдумать как прогнаиь это животное рандомом
//        WildAnimals animals1 = animals[];
        System.out.println("Прогоняет дикое животное, которое пришло на ферму");
    }

    private void feedPet(PetAnimal[] animals) {   // Короче тут надо обдумать как кормить эту скотину
        for (int i = 0; i < animals.length; i++) {
            }
        System.out.println("Кормит домашнее животное");
    }


}
