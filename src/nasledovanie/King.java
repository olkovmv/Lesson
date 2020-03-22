package nasledovanie;

public class King extends Unit {
    protected int gold;

    public King(int healthScore, int speed) {
        super(healthScore, speed);
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public void rest() {
        System.out.println("Король оьдыхает");

    }
}
