package Generic.garage;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class BikeGarage extends Garage<Bus>{
    public void checkBike(){
        System.out.println(this.getCarOnServise().isWiFi());
    }

}

class BikeGarage2 extends  Garage<Transport>{
    public void checkBike(){
        // вернет обьект типа транспорт
        System.out.println(this.getCarOnServise().getNum());
    }

}

class BikeGarage3 extends Garage{
    public void checkBike(){
        // Шет кар он сервис вернет обьект типа транспорт
        // Так как указаг в шараж ограничение по трансопрту
        System.out.println(this.getCarOnServise().getNum());
    }

}

