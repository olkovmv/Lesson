package re.bm.core.Figures;

public class Triangle {
    private String name = "Triangle";
    private double x;
    private double y;
    private double z;

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public double per(double x, double y, double z){
        return x+y+z;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
