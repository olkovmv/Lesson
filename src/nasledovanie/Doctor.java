package nasledovanie;


public class Doctor extends BattleUnit  {
    protected int medicineScore;






    public Doctor(int score, int healthScore, int speed, int attackSkore, int medicineScore) {
        super(healthScore, speed, attackSkore);
        setMedicineScore(medicineScore);
    }

    public int getMedicineScore() {
        return medicineScore;
    }

    public void setMedicineScore(int medicineScore) {
        this.medicineScore = medicineScore;
    }

    @Override // Указатель - без него тоже будет работать // Не только указатель нам но и  компилятору / Мы переопределяем метод /
    public void attack(BattleUnit friend) {
        System.out.println("Атака доктора");
    }

    @Override
    public void run() {
        System.out.println("Доктор");
    }

    @Override
    public void rest() {
        System.out.println("Доктор отдыхает");
    }


}
