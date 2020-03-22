package re.bm.core.Samrab;

import java.util.PrimitiveIterator;
import java.util.function.DoubleToIntFunction;

public class Maush  implements CanEat{
    private String grizuni;

    public Maush() {

    }

    @Override
    public void canEat(CanBeEaten canBeEaten) {
                System.out.println("Мышку скушали");

    }
}
