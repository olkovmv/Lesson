package School;

public class Main {
    public static void main(String[] args) {


        Uchitel uchitel = new Uchitel("Maria", 54, "Math");
        Uchenik uchenik1 = new Uchenik("Gosha", 12, "Geogr", 0);
        Uchenik uchenik2 = new Uchenik("Boris", 11, "Math", 2);
        Director director = new Director("Владислав Петровтич", 77);
        School school = new School();
        uchitel.uchitKogo(uchenik1);
        uchitel.uchitKogo(uchenik2);
        System.out.println(uchenik1.toString());
        System.out.println(uchenik2.toString());
        uchitel.uchitKogo(uchenik1);
        uchitel.uchitKogo(uchenik2);
        System.out.println(uchenik1.toString());
        System.out.println(uchenik2.toString());
    }
}