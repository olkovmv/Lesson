package Generic.garage;
// Если в качестве дженерик мы используем T extends Transport>
//то тип данных carOnServise можкт транспорт и ве его потомки
// В таком случае для carOnServise будут доступны методы Transport

// Наследование одно но может пользоваться контрактами на интерфейс
//их может буть дохуя

public class Garage<T extends Transport & Repairing>{ // В таком случае попадут толлько
    // те которые оба интерфейса
    private T carOnServise;

    public T getCarOnServise() {
        return carOnServise;
    }

    public void setCarOnServise(T carOnServise) {
        this.carOnServise = carOnServise;
    }
// Есои троько Т то можем пользоваться только методами обджект
    // Если ограничиваем то дженериком может быть транспорт и его потомки

    public void servise(){
        carOnServise.repair();

    }

}
