package TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        ToFahrenheit toFahrenheit = new ToFahrenheit(43);
        ToKelvin toKelvin = new ToKelvin(32);
        toFahrenheit.setTempCel(223);
        toFahrenheit.convertValue();
        toKelvin.convertValue();
        toFahrenheit.getConvertedValue();
        toKelvin.getConvertedValue();
        System.out.println(toFahrenheit.getConvertedValue());
        System.out.println(toKelvin.getConvertedValue());
    }
}
