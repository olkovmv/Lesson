package re.bm.core.CatsFight;

public class Cat {
    private String name;
    private int ves;
    private int vozrast;
    private String color;
    private String adress;
    private int zdorovie;
    private int silaUd;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int vozrast) {
        this.name = name;
        this.vozrast = vozrast;
    }

    public Cat(String name, int ves, int vozrast) {
        this.name = name;
        this.ves = ves;
        this.vozrast = vozrast;

    }

    public Cat(int ves, String color, String adress) {
        this.ves = ves;
        this.color = color;
        this.adress = adress;
    }

    public Cat(int ves, String color) {
        this.ves = ves;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getZdorovie() {
        return zdorovie;
    }

    public void setZdorovie(int zdorovie) {
        this.zdorovie = zdorovie;
    }

    public int getSilaUd() {
        return silaUd;
    }

    public void setSilaUd(int silaUd) {
        this.silaUd = silaUd;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", ves=" + ves +
                ", vozrast=" + vozrast +
                ", color='" + color + '\'' +
                ", adress='" + adress + '\'' +
                ", zdorovie=" + zdorovie +
                ", silaUd=" + silaUd +
                '}';
    }

    public void fight(Cat anotherCat){
        this.zdorovie = this.zdorovie-anotherCat.silaUd;
        if (this.zdorovie <= 0){
            System.out.println("Кот проиграл битву");}
        else System.out.println("У вашего кота осталось " + this.zdorovie + "здоровья");



    }
}
