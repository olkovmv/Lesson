package re.bm.core.Figures;

public class Rectangle {
    private String name = "Rectangle";
    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;

        }
    public double perim (double x, double y) {
        return x+x+y+y;
    }
    public  double plosh (double x, double y) {
        return  x * y;

    }
}
