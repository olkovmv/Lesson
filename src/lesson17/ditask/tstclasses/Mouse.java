package lesson17.ditask.tstclasses;


import lesson17.ditask.container.marks.Required;
import lesson17.ditask.container.marks.RequiredClass;
import lesson17.ditask.tstclasses.config.AnimalsConfig;


@RequiredClass
public class Mouse {
    @Required
    private AnimalsConfig mouseConfig;
    private String name;
    private int speed;

    public Mouse() {
        name = mouseConfig.getMouseName();
        speed = mouseConfig.getMouseSpeed();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
