package nasledovanie;


// Дочерние классы имеют доступ ко всем свойствам и методам родителей

// Нельзя создать обьект  !!!!!!!!!!
// Только методы без реализации !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!





//Если клас имплиментирует методы одинаковые ужно в классе описать реалищацию

public interface CanAttack {

    void attack(BattleUnit enemy);

    default void runFromField(){
        System.out.println("Сбежал с поля боя");
    }

}
