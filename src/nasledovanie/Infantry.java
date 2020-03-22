package nasledovanie;


public class Infantry extends BattleUnit {
    protected int armor;

    public Infantry(int healthScore, int speed, int attackSkore, int armor) {
        super(healthScore, speed, attackSkore);
        setArmor(armor);

    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Оружейник атакуает");
    }

    @Override
    public void rest() {
        System.out.println("Оружейник отдыхает");
    }


}
