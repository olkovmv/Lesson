package School;

public class Uchenik extends Personal implements Uchitcia {
    protected String izPredmet;
    protected int urZnan = 0;


    public String getIzPredmet() {
        return izPredmet;
    }

    public void setIzPredmet(String izPredmet) {
        this.izPredmet = izPredmet;
    }

    public int getUrZnan() {
        return urZnan;
    }

    public void setUrZnan(int urZnan) {
        this.urZnan = urZnan;
    }

    public Uchenik(String name, int vozrast, String izPredmet, int urZnan) {
        super(name, vozrast);
        setIzPredmet(izPredmet);
        setUrZnan(urZnan);
    }

    @Override
    public void polZnania() {
        this.urZnan = getUrZnan() + 1;
        System.out.println("Ученик получает знания");
    }

    @Override
    public String toString() {
        return "Uchenik{" +
                "izPredmet='" + izPredmet + '\'' +
                ", urZnan=" + urZnan +
                '}';
    }
}
