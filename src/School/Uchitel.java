package School;

public class Uchitel extends Personal implements Uchit {
    protected String prepPredmet;

    public String getPrepPredmet() {
        return prepPredmet;
    }

    public void setPrepPredmet(String prepPredmet) {
        this.prepPredmet = prepPredmet;
    }

    public Uchitel(String name, int vozrast, String prepPredmet) {
        super(name, vozrast);
        setPrepPredmet(prepPredmet);
    }

    @Override
    public void uchitKogo(Uchenik anyUch) {
        if (anyUch.getIzPredmet().equals(prepPredmet)) {
            anyUch.polZnania();
            System.out.println("Учитель  дает знания");
        } else System.out.println("Разные предметы");
    }
}
