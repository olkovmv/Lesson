package Mountaineering;

public class Main {


    public static void main(String[] args) {

        Mountain mountain1 = new Mountain();
        mountain1.setCoutry("Россия");
        mountain1.setNameMountain("Эльбрус");
        mountain1.setHeight(23454);


        Mountain mountain2 = new Mountain();
        mountain2.setCoutry("Италия");
        mountain2.setNameMountain("Кур");
        mountain2.setHeight(12340);

        Mountain mountain3 = new Mountain();
        mountain3.setCoutry("Грузия");
        mountain3.setNameMountain("Казбег");
        mountain3.setHeight(1890);

        Groups groups1 = new Groups();
        Groups groups2 = new Groups();
        Groups groups3 = new Groups();


        Climber climber1 = new Climber();
        climber1.setNameClimber("Петр");
        climber1.setAdress("Питер");

        Climber climber2 = new Climber();
        climber2.setNameClimber("Васили ");
        climber2.setAdress("Москва");


        Climber climber3 = new Climber();
        climber3.setNameClimber("Андрей");
        climber3.setAdress("Пермь");


        Climber climber4 = new Climber();
        climber4.setNameClimber("Антон");
        climber4.setAdress("Екб");

        Climber climber5 = new Climber();
        climber5.setNameClimber("Борис");
        climber5.setAdress("Камчатка");





    }
}
