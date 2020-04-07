package Mountaineering;

public class Mountain {
    private String nameMountain;
    private String coutry;
    private int height;

    public String getNameMountain() {
        return nameMountain;
    }

    public void setNameMountain(String nameMountain) {
        if (nameMountain.length()>4){this.nameMountain = nameMountain;}
    }

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        if(coutry.length()>4){this.coutry = coutry;}
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height>180){this.height = height;}
    }


    @Override
    public String toString() {
        return "Mountain{" +
                "nameMountain='" + nameMountain + '\'' +
                ", coutry='" + coutry + '\'' +
                ", height=" + height +
                '}';
    }
}
