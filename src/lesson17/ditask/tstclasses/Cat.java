package lesson17.ditask.tstclasses;

import lesson17.ditask.container.marks.Required;
import lesson17.ditask.container.marks.RequiredClass;
import lesson17.ditask.tstclasses.config.AnimalsConfig;


import java.util.ArrayList;

@RequiredClass
public class Cat {
    @Required
    private AnimalsConfig catConfig;
    private String name;
    private int speed;

    @Required
    private Owner owner;

    private ArrayList<Mouse> mice = new ArrayList<>(20);

    public Cat() {
        name = catConfig.getCatName();
        speed = catConfig.getCatSpeed();
    }

    public void catchMouse(Mouse mouse) {
        if (speed < mouse.getSpeed()) {
            System.out.println(mouse.getName() + " убежал от " + name);
            return;
        }
        mice.add(mouse);
        System.out.println(name + " поймал " + mouse.getName());

    }

}
