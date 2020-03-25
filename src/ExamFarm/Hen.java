package ExamFarm;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Hen extends PetAnimal implements GiveResources, ToBeEaten {


    public Hen(String name, int weight, int speed, int health, int resourrces) {
        super(name, weight, speed, health, resourrces);
    }

    public Hen() {}

    @Override
    public void GiveResourc() {
        System.out.println("Курица дает яйца");
    }

    @Override
    public void toBeEaten() {
        System.out.println("Курица сьедена");


    }
}
