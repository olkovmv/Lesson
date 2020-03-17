package re.bm.core.Figures;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Circle circle1 = new Circle(22);
        circle1.setDiametr(21);
        Rectangle rectangle1 = new Rectangle(21, 21);
        Triangle triangle1 = new Triangle(21, 21, 24);
        System.out.println(circle1.dlinOcr(1));
        System.out.println(rectangle1.perim(21, 42));

          triangle1.per(21,12,43);

        System.out.println(triangle1.toString());
    }
}
