package Generic.garage;

public class TstGarage {
    public static void main(String[] args) {
        Bus bus = new Bus("Спб", "Тверь", "234", false);
        Train train = new Train("Спб", "Москва", "23-Ф", 12);
        Garage<Bus> garage1 = new Garage<>();
        garage1.setCarOnServise(bus); // Тип поля carOnService Bus (Не транспорт)
        System.out.println(garage1.getCarOnServise().isWiFi());

        Garage<Train> garage2 = new Garage<>();
        garage2.setCarOnServise(train);
        System.out.println(garage2.getCarOnServise().getCarCount());

        Garage<Transport> garage3 = new Garage<>();
        garage3.setCarOnServise(train);
        garage3.setCarOnServise(bus); // Тут недоступны индивидуальные методы
        // Только методы транспорт

        MarshTaxi marshTaxi = new MarshTaxi("Спб", "Москва", "23-Ф", true);

        Garage<Bus> garage4 = new Garage<>();
        garage4.setCarOnServise(marshTaxi);
        marshTaxi.polShtraf();

    }
}
