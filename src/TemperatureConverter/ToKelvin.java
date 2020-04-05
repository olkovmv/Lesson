package TemperatureConverter;

public class ToKelvin extends Celsius implements ConversionValue, TemperatureConverter {
    private double tempKal;
    private final static double svoKonv =273.15;


    public ToKelvin(double tempCel) {
        super(tempCel);

    }

    public double getTempKal() {
        return tempKal;
    }

    public void setTempKal(double tempKal) {
        this.tempKal = tempKal;
    }

    @Override
    public double getConvertedValue() {
        return getTempKal();

    }

    @Override
    public void convertValue() {
        tempKal = getTempCel()+svoKonv;

    }
}
