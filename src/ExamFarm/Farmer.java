package ExamFarm;

public class Farmer {
    private  int resources = 5;

    public Farmer(int resources) {
         setResources(resources);
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }




    private void GetResources(){
        System.out.println("Собирает ресурсы с домашних животных, которые могут давать ресурсы");
    }

    private void animalEats(){
        System.out.println("Съедает домашнее животное, которое пригодно в пищу");
    }

    private void animalAway(){
        System.out.println("Прогоняет дикое животное, которое пришло на ферму");
    }

    private void feedPet(){
        System.out.println("Кормит домашнее животное");
    }


}
