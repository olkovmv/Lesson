package School;

public class Uchitel extends Personal implements Uchit {
    private String prepPredmet;


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

    public Uchitel() {
        super();

    };


    @Override
    public void uchitKogo(Uchenik anyUch) {
        if (anyUch.getIzPredmet().equals(prepPredmet)) {
            anyUch.polZnania();
            System.out.println("Учитель  дает знания");
        } else System.out.println("Разные предметы");
    }

    @Override
    public void setVozrast(int vozrast) {
        if ( vozrast > 32){
        super.setVozrast(vozrast); }
    }
}
