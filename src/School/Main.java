package School;

import java.awt.geom.AffineTransform;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Uchitel uchitel = new Uchitel();
        uchitel.setPrepPredmet("Математика");
        uchitel.setVozrast(44);
        uchitel.setName("Варвара");
        uchitel.setPrepPredmet("История");
        uchitel.setVozrast(55);
        uchitel.setName("Федоровна");
        uchitel.setPrepPredmet("Геометрия");
        uchitel.setVozrast(66);
        uchitel.setName("Мария");
        Uchenik uchenik = new Uchenik();
        uchenik.setUrZnan(12);
        uchenik.setIzPredmet("Математика");
        uchenik.setVozrast(12);
        uchenik.setName("Петя");


        uchenik.setUrZnan(0);
        uchenik.setIzPredmet("История");
        uchenik.setVozrast(12);
        uchenik.setName("Саша");

        uchenik.setUrZnan(0);
        uchenik.setIzPredmet("Алгебра");
        uchenik.setVozrast(12);
        uchenik.setName("Ваня");

        Director director = new Director("Владимир петрович", 88);
        School school = new School();
        school.adUchenik(uchenik);
        school.adUchitel(uchitel);




    }
}