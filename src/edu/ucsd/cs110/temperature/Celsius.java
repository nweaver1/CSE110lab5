package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float f = ((this.getValue()*9)/5) + 32;
        Temperature newTemp = new Fahrenheit(f);
        return newTemp;
    }

    public String toString()
    {
        // TODO: Complete this method
        String beginning = "" + this.getValue();
        String ending = " C";
        String complete = beginning + ending;
        return complete;
    }
}