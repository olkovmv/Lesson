package Enums;

import java.util.Arrays;

public class EnumExample {
    public static void main(String[] args) {

        Article article = new Article("Путешествие по австралии");
        article.setText("Текст статьи");
        article.setCoutry(Country.AUSTRALIA);

        Article article1 = new Article("Путешествие по UK");
        article1.setText("Текст статьи");
        article1.setCoutry(Country.UK);
        System.out.println(article);
        System.out.println(article1);


        Country[] countries= Country.values();
        System.out.println(Arrays.toString(countries));
        System.out.println(Country.UK.ordinal());

        for (Country country:countries) {
            System.out.println("Country" + country.name()+ " - " + country.ordinal());

        }

//        System.out.println(Country.valueOf("UA")); // получаем эксепшен
        System.out.println(Country.valueOf("USA"));

        //enum Ptriotity
        int codeHight = Priotity.HiGHT.getCode();
        System.out.println(codeHight);
        Priotity low = Priotity.LOW;
        low.setCode(1244);
        System.out.println(Priotity.LOW.getCode());


        Operations operations = Operations.MULTI;


        System.out.println(operations.actions(2,3));


        Planet[] planets = Planet.values();
        System.out.println(Arrays.toString(Planet.values()));
        for (Planet plan: planets
             ) {
            System.out.println(plan.name()+ " Massa " + plan.getMassa() + " Radius" + plan.getRadius());

        }

    }
}



enum Country {
    UK, USA, AUSTRALIA // элементы enuma Countru
}
enum Priotity{
    HiGHT(21), MIDLE(23), LOW(33);
    private int code;

    Priotity(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

enum Operations {
    SUM {
        @Override
        public int actions(int a, int b) {
            return a * b;
        }
    },
    MULTI {
        @Override
        public int actions(int a, int b) {
            return a + b;
        }

    };
    public abstract int actions(int a, int b);
}

enum Planet{
    VENERA(21,21), MARS(33,32), SEMLIA(333, 32), UPITER(32, 12);
    private int massa;
    private int radius;

    Planet(int massa, int radius) {
        this.massa = massa;
        this.radius = radius;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "massa=" + massa +
                ", radius=" + radius +
                '}';
    }
}