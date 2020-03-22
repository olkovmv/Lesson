package nasledovanie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BattleUnit unit1 = BattleUnit.getBattleUnit("knight");
//        BattleUnit unit2 = BattleUnit.getBattleUnit("infantry");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип первого юнита");
        BattleUnit unit1 = BattleUnit.getBattleUnit(scanner.nextLine());

        System.out.println("Введите тип второго юнита");
        BattleUnit unit2 = BattleUnit.getBattleUnit(scanner.nextLine());

        unit1.attack(unit2);



    }
}
