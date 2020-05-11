package lesson17.ditask.tstclasses;


import lesson17.ditask.container.marks.Required;
import lesson17.ditask.container.marks.RequiredClass;
import lesson17.ditask.tstclasses.config.AnimalsConfig;


@RequiredClass
public class Owner {
    @Required
    private AnimalsConfig ownerConfig;
    private String name;

    public Owner() {
        name = ownerConfig.getOwnerName();
    }
}
