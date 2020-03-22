package nasledovanie;

public class Knight extends BattleUnit{
    protected int horseSpeed;


    public Knight(int healthScore, int speed, int attackSkore, int horseSpeed) {
        super(healthScore, speed, attackSkore);
        setHorseSpeed(horseSpeed);
    }

    public int getHorseSpeed() {
        return horseSpeed;
    }

    public void setHorseSpeed(int horseSpeed) {
        this.horseSpeed = horseSpeed;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Рыцарь атакует");
    }

    @Override
    public void rest() {
        System.out.println("Рыцпрь отдыхает");
    }




}
