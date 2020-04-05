package TemperatureConverter;

public class ToFahrenheit extends Celsius implements ConversionValue, TemperatureConverter{
    private double tempFar;
    private final static double svoKonv1 =1.8;
    private final static double svoKonv2 =32;

    public ToFahrenheit(double tempCel) {
        super(tempCel);


    }

    public double getTempFar() {
        return tempFar;
    }

    public void setTempFar(double tempFar) {
        this.tempFar = tempFar;
    }

    @Override
    public double getConvertedValue() {
        return getTempFar();



    }

    @Override
    public void convertValue() {
        tempFar =  getTempCel() * svoKonv1 + svoKonv2;
        System.out.println("Температура метода Фар "+ getTempFar());
        System.out.println("Температура метода Фар "+ tempFar);

    }
}
