package re.bm.core.Figures;

public class Circle {
    private String name = "Circle";
    private double pii = 3.14;
    private double diametr;

    public Circle(double diametr) {
        if (diametr> 0 ) {
        this.diametr = diametr;}
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public double dlinOcr(double diametr) {
        return diametr*pii;
    }

}
