package nasledovanie;

abstract  class BattleUnit  extends Unit implements CanAttack{ ///Множественное наследование запрещено
    /// Имплиминтируя класс. Заключает контракт на реализацию всех методов интерфейса
//Абстракны клас - это класс без описания








    protected  int attackSkore;

    public BattleUnit(int healthScore, int speed, int attackSkore) {
        super(healthScore, speed);// вызов конструктора родительского класса
        setAttackSkore(attackSkore);
    }

    public void setAttackSkore(int attackSkore) {
        this.attackSkore = attackSkore;
    }

    public int getAttackSkore() {
        return attackSkore;
    }



    @Override
    public void runFromField() {
        System.out.println("Король куда то бежит");

    }

    public static  BattleUnit getBattleUnit(String type){
        BattleUnit battleUnit = null;
        if("knight".equals(type)){
            battleUnit = new Knight((int)(Math.random()*10 + 2),
                    (int)(Math.random()*7 +1),
                    (int)(Math.random()*8+1),
                    (int)(Math.random()*13 + 3));
        }

        else if ("doctor".equals(type)){
            battleUnit = new Doctor((int) (Math.random() * 10 + 2),
                    (int) (Math.random() * 7 + 1),
                    (int) (Math.random() * 8 + 1),
                    (int) (Math.random() * 13 + 3),
                    (int) (Math.random() * 13 + 3));
        }
        else if ("infantry".equals(type)){
            battleUnit = new Infantry((int)(Math.random()*10 + 2),
                    (int)(Math.random()*7 +1),
                    (int)(Math.random()*8+1),
                    (int)(Math.random()*13 + 3));
        }

        return battleUnit;
    }
}
