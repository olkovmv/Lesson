package Lesson14.comparing;



import javax.crypto.spec.PSource;
import java.util.*;

public class ComparingExample {
    public static void main(String[] args) {
        Car blackOpel = new Car("black", "opel", 2000);
        Car redOpel = new Car("red", "opel", 2500);
        Car yellowMazda = new Car("yellow", "mazda", 3000);
        Car greenMazda = new Car("green", "mazda", 3000);

        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(blackOpel);
        carArrayList.add(redOpel);
        carArrayList.add(yellowMazda);
        carArrayList.add(greenMazda);

        System.out.println(carArrayList);

        Comparator<Car> carComparator = new CarBrendComporator()
                .thenComparing(new CarPriceComporator()).thenComparing(new CarCollordComporator());

        TreeSet<Car> treeSet2 = new TreeSet<>(carComparator);

        treeSet2.addAll(carArrayList);
        System.out.println(treeSet2);




    }
}
