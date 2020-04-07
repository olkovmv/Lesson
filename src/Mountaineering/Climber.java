package Mountaineering;

import sun.lwawt.macosx.CPrinterDevice;

import javax.swing.*;

public class Climber {
    private String nameClimber;
    private String adress;

    public String getNameClimber() {
        return nameClimber;
    }

    public void setNameClimber(String nameClimber) {
        if (nameClimber.length() > 4){this.nameClimber = nameClimber;}
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        if(adress.length()>5){this.adress = adress;}
    }
}
