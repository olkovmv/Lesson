package re.bm.core.Figures;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Circle circle1 = new Circle(22);
        circle1.setDiametr(21);
        Rectangle rectangle1 = new Rectangle(21, 21);
        Triangle triangle1 = new Triangle(21, 21, 24);
        System.out.println(circle1.dlinOcr(1));
        System.out.println(rectangle1.perim(21, 42));

        System.out.println(triangle1.toString());
          triangle1.setZ(12);
          triangle1.setY(11);
          triangle1.setY(11);

        System.out.println(triangle1.per(21,2, 23));


    }
}
