package nasledovanie;

public interface CanRest {
    void rest();

    default void runFromField(){
        System.out.println("Сбежал с поля боя");
    }
}
