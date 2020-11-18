package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float f = (((this.getValue() - 32) * 5)/9);
        Temperature newTemp = new Celsius(f);
        return newTemp;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        String beginning = "" + this.getValue();
        String ending = " F";
        String complete = beginning + ending;
        return complete;
    }
}
